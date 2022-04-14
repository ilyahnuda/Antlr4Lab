package wallker;

import Elements.*;
import base.Base;
import com.antr.testBaseVisitor;
import com.antr.testParser;

import java.util.ArrayList;
import java.util.List;

public class MyWalker extends testBaseVisitor<Base> {
    public static List<Function> functions;
    public static List<Statement> statements;
    public static List<Declaration> declarations;

    @Override
    public Program visitProgram(testParser.ProgramContext ctx) {

        functions = new ArrayList<>();
        statements = new ArrayList<>();
        declarations = new ArrayList<>();
        if (ctx.function().size() > 0) {
            for (testParser.FunctionContext i : ctx.function()) {
                Function s = visitFunction(i);
                functions.add(s);
            }
            Program.stack__id = new ArrayList<>();
        }
        if (ctx.statement().size() > 0) {
            for (testParser.StatementContext i : ctx.statement()) {
                Statement s = visitStatement(i);
                if (s == null)
                    continue;
                statements.add(s);
            }
        }

        return new Program(functions, statements);
    }

    @Override
    public Statement visitStatement(testParser.StatementContext ctx) {
        if (ctx.print_expr() != null) {
            return visitPrint_expr(ctx.print_expr());
        } else if (ctx.functionCall() != null) {
            return visitFunctionCall(ctx.functionCall());
        } else if (ctx.declaration() != null) {
            return visitDeclaration(ctx.declaration());
        } else if (ctx.ifStatement() != null) {
            return visitIfStatement(ctx.ifStatement());
        } else if (ctx.whileCycle() != null) {
            return visitWhileCycle(ctx.whileCycle());
        } else if (ctx.assigment() != null) {
            return visitAssigment(ctx.assigment());
        }
        return null;
    }

    @Override
    public Print visitPrint_expr(testParser.Print_exprContext ctx) {
        return new Print(visitExpressionMath(ctx.expressionMath()));
    }

    @Override
    public ExpressionMath visitExpressionMath(testParser.ExpressionMathContext ctx) {
        if (ctx.NUMBER() != null) {
            return new ExpressionMath(new NUMBER(ctx.NUMBER().getText()));
        } else if (ctx.arif() != null) {
            return new Arif(visitExpressionMath(ctx.expressionMath(0)), ctx.arif().getText(), visitExpressionMath(ctx.expressionMath(1)));
        } else if (ctx.ID() != null) {
            return new ExpressionMath(ctx.getText());
        } else if (ctx.FLOATNUMBER() != null) {
            return new ExpressionMath(new FloatNumber(ctx.FLOATNUMBER().getText()));
        } else if (ctx.functionCall() != null) {
            return visitFunctionCall(ctx.functionCall());
        }
        return null;
    }

    @Override
    public FunctionCall visitFunctionCall(testParser.FunctionCallContext ctx) {
        List<ExpressionMath> expression = new ArrayList<>();
        if (ctx.expressionMath().size() > 0) {
            for (int i = 0; i < ctx.expressionMath().size(); i++) {
                expression.add(visitExpressionMath(ctx
                        .expressionMath().get(i)));
            }
        }
        return new FunctionCall(ctx.ID().getText(), expression);
    }

    @Override
    public Declaration visitDeclaration(testParser.DeclarationContext ctx) {
        String str = null;
        if (ctx.type().size() > 1) {
            str = ctx.type().get(1).getText();
        }
        return new Declaration(ctx.type().get(0).getText(), visitExpressionMath(ctx.expressionMath()), str, ctx.ID().getText());
    }

    @Override
    public If visitIfStatement(testParser.IfStatementContext ctx) {
        List<Statement> statements = new ArrayList<>();
        int counter=0;
        for (testParser.StatementContext i : ctx.statement()) {
            Statement s = visitStatement(i);
            if (s.getClass().equals(Declaration.class)) {
                Semantic.checkContext(declarations, (Declaration) s);
                declarations.add((Declaration) s);
                counter++;
            }
            statements.add(s);
        }
        for(int i=0;i<counter;i++){
            declarations.remove(declarations.size()-1-i);
        }
        IfHeader ifH = visitIfHeader(ctx.ifHeader());
        ElseStatement elseStatement = null;
        if (ctx.elseStatement() != null) {
            elseStatement = visitElseStatement(ctx.elseStatement());

        }
        return new If(statements, elseStatement, ifH);
    }

    @Override
    public IfHeader visitIfHeader(testParser.IfHeaderContext ctx) {
        return new IfHeader(visitBoolExpr(ctx.boolExpr()));
    }

    @Override
    public BoolExpr visitBoolExpr(testParser.BoolExprContext ctx) {
        if (ctx.TRUE() != null)
            return new BoolExpr(ctx.TRUE().getText());
        else if (ctx.FALSE() != null)
            return new BoolExpr(ctx.FALSE().getText());
        else if (ctx.NEGATION() != null) {
            return new BoolExpr(ctx.NEGATION().getText(), visitBoolExpr(ctx.boolExpr()));
        } else if (ctx.expressionMath() != null) {
            return new BoolExpr(visitExpressionMath(ctx.expressionMath(0)), ctx.compare_op().getText(), visitExpressionMath(ctx.expressionMath(1)));
        }
        return null;
    }

    @Override
    public WhileCicle visitWhileCycle(testParser.WhileCycleContext ctx) {
        List<Statement> statements = new ArrayList<>();
        int counter=0;
        for (testParser.StatementContext i : ctx.statement()) {
            Statement s = visitStatement(i);
            if (s.getClass().equals(Declaration.class)) {
                Semantic.checkContext(declarations, (Declaration) s);
                declarations.add((Declaration) s);
                counter++;
            }
            statements.add(s);
        }
        for(int i=0;i<counter;i++){
            declarations.remove(declarations.size()-1-i);
        }
        WhileHeader header = visitWhileHeader(ctx.whileHeader());
        return new WhileCicle(header, statements);
    }

    @Override
    public WhileHeader visitWhileHeader(testParser.WhileHeaderContext ctx) {
        return new WhileHeader(visitBoolExpr(ctx.boolExpr()));
    }

    @Override
    public Function visitFunction(testParser.FunctionContext ctx) {
        FunctionHeader header = visitFunctionHeader(ctx.functionHeader());
        List<Statement> statements = new ArrayList<>();
        for (int i = 0; i < ctx.statement().size(); i++) {
            statements.add(visitStatement(ctx.statement().get(i)));
        }
        return new Function(header, statements, visitExpressionMath(ctx.expressionMath()));

    }

    @Override
    public FunctionHeader visitFunctionHeader(testParser.FunctionHeaderContext ctx) {
        FunctionParameter fP = visitFunctionParameters(ctx.functionParameters());
        if (ctx.type().isEmpty()) {
            return new FunctionHeader(ctx.VOID().getText(), ctx.ID().getText(), fP);
        }
        Semantic.checkOverload(ctx.ID().getText(), functions);
        return new FunctionHeader(ctx.type().getText(), ctx.ID().getText(), fP);
    }

    @Override
    public FunctionParameter visitFunctionParameters(testParser.FunctionParametersContext ctx) {
        List<Parameter> st = new ArrayList<>();
        for (int i = 0; i < ctx.type().size(); i++) {
            Parameter s = new Parameter(ctx.type(i).getText(), ctx.ID(i).getText());
            System.out.println(s);
            st.add(s);
        }
        return new FunctionParameter(st);
    }

    @Override
    public Assigment visitAssigment(testParser.AssigmentContext ctx) {
        String str = null;
        if (ctx.type() != null) {
            str = ctx.type().getText();
        }
        return new Assigment(str, visitExpressionMath(ctx.expressionMath()), ctx.ID().getText());
    }

    @Override
    public ElseStatement visitElseStatement(testParser.ElseStatementContext ctx) {
        List<Statement> statements = new ArrayList<>();
        int counter=0;
        for (testParser.StatementContext i : ctx.statement()) {
            Statement s = visitStatement(i);
            if (s.getClass().equals(Declaration.class)) {
                Semantic.checkContext(declarations, (Declaration) s);
                declarations.add((Declaration) s);
                counter++;
            }
            statements.add(s);
        }
        for(int i=0;i<counter;i++){
            declarations.remove(declarations.size()-1-i);
        }
        return new ElseStatement(statements);
    }
}
