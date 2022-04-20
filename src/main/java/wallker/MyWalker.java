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
    public static List<Declaration> global;
    List<testParser.StatementContext> global_contex = new ArrayList<>();
    public void findInSubStat(testParser.StatementContext ctx) {

        if (ctx.whileCycle() != null) {
            for (testParser.StatementContext w : ctx.whileCycle().statement()) {
                if (w.declaration() != null) {
                    if (w.declaration().GLOBAL() != null) {
                        global.add(visitDeclaration(w.declaration()));
                        global_contex.add(w);
                    }
                } else if (w.whileCycle() != null) {
                    findInSubStat(w);
                } else if (w.ifStatement() != null) {
                    findInSubStat(w);
                }
            }
        } else if (ctx.ifStatement() != null) {
            for (testParser.StatementContext w : ctx.ifStatement().statement()) {
                if (w.declaration() != null) {
                    if (w.declaration().GLOBAL() != null) {
                        global.add(visitDeclaration(w.declaration()));
                        global_contex.add(w);
                    } else if (w.whileCycle() != null) {
                        findInSubStat(w);
                    } else if (w.ifStatement() != null) {
                        findInSubStat(w);
                    }
                }
            }
            if (ctx.ifStatement().elseStatement() != null) {
                for (testParser.StatementContext w : ctx.ifStatement().elseStatement().statement()) {
                    if (w.declaration() != null) {
                        if (w.declaration().GLOBAL() != null) {
                            global.add(visitDeclaration(w.declaration()));
                            global_contex.add(w);
                        } else if (w.whileCycle() != null) {
                            findInSubStat(w);
                        } else if (w.ifStatement() != null) {
                            findInSubStat(w);
                        }
                    }
                }
            }
        }
    }

    public void findGlobal(testParser.ProgramContext ctx) {
        for (testParser.FunctionContext fC : ctx.function()) {
            for (testParser.StatementContext s : fC.statement()) {
                if (s.declaration() != null) {
                    if (s.declaration().GLOBAL() != null) {
                        global.add(visitDeclaration(s.declaration()));
                        global_contex.add(s);
                    }
                } else if (s.whileCycle() != null) {
                    findInSubStat(s);
                } else if (s.ifStatement() != null) {
                    findInSubStat(s);
                }
            }
        }
        for (testParser.StatementContext s : ctx.statement()) {
            if (s.declaration() != null) {
                if (s.declaration().GLOBAL() != null) {
                    global.add(visitDeclaration(s.declaration()));
                    global_contex.add(s);
                }
            } else if (s.whileCycle() != null) {
                findInSubStat(s);
            } else if (s.ifStatement() != null) {
                findInSubStat(s);
            }
        }
    }

    @Override
    public Program visitProgram(testParser.ProgramContext ctx) {

        global = new ArrayList<>();
        functions = new ArrayList<>();
        statements = new ArrayList<>();
        declarations = new ArrayList<>();
        findGlobal(ctx);
        if (ctx.function().size() > 0) {
            for (testParser.FunctionContext i : ctx.function()) {
                Function s = visitFunction(i);
                functions.add(s);
            }
            declarations = new ArrayList<>();
        }
        if (ctx.statement().size() > 0) {
            for (testParser.StatementContext i : ctx.statement()) {
                if (!global_contex.contains(i)) {
                    Statement s = visitStatement(i);
                    if (s == null)
                        continue;
                    if (s.getClass().equals(Declaration.class)) {
                        if (((Declaration) s).isGlobal) {
                            continue;
                        }
                        Semantic.checkContext(declarations, ((Declaration) s).getName());
                        declarations.add((Declaration) s);
                    }
                    statements.add(s);
                }
            }
        }

        return new Program(functions, statements, global);
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
        String global1 = null;
        if (ctx.GLOBAL() != null) {
            global1 = ctx.GLOBAL().getText();
            for (Declaration d : global) {
                if (d.getName().equals(ctx.ID().getText())) {
                    ErrorListener.callErrorContext(d.getName());
                }
            }
        }
        String cons = null;
        if (ctx.CONST() != null) {
            cons = ctx.CONST().getText();
        }
        return new Declaration(ctx.type().get(0).getText(), visitExpressionMath(ctx.expressionMath()), str, ctx.ID().getText(), global1, cons);
    }

    @Override
    public If visitIfStatement(testParser.IfStatementContext ctx) {
        List<Statement> statements = new ArrayList<>();
        int counter = 0;
        for (testParser.StatementContext i : ctx.statement()) {
            Statement s = visitStatement(i);
            if (s.getClass().equals(Declaration.class)) {
                Semantic.checkContext(declarations, ((Declaration) s).getName());
                if (((Declaration) s).isGlobal) {
                    MyWalker.global.add((Declaration) s);
                } else {
                    declarations.add((Declaration) s);
                    counter++;
                }
            }
            statements.add(s);
        }
        for (int i = 0; i < counter; i++) {
            declarations.remove(declarations.size() - 1 - i);
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
        int counter = 0;
        for (testParser.StatementContext i : ctx.statement()) {
            Statement s = visitStatement(i);
            if (s.getClass().equals(Declaration.class)) {
                Semantic.checkContext(declarations, ((Declaration) s).getName());
                declarations.add((Declaration) s);
                counter++;
            }
            statements.add(s);
        }
        for (int i = 0; i < counter; i++) {
            declarations.remove(declarations.size() - 1 - i);
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
            Statement s = visitStatement(ctx.statement().get(i));
            if (s.getClass().equals(Declaration.class)) {
                Semantic.checkContext(declarations, ((Declaration) s).getName());
                if (((Declaration) s).isGlobal) {
                    MyWalker.global.add((Declaration) s);
                } else {
                    declarations.add((Declaration) s);
                }
            }
            statements.add(s);
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
        int counter = 0;
        for (testParser.StatementContext i : ctx.statement()) {
            Statement s = visitStatement(i);
            if (s.getClass().equals(Declaration.class)) {
                Semantic.checkContext(declarations, ((Declaration) s).getName());
                if (((Declaration) s).isGlobal) {
                    MyWalker.global.add((Declaration) s);
                } else {
                    declarations.add((Declaration) s);
                    counter++;
                }
            }
            statements.add(s);
        }
        for (int i = 0; i < counter; i++) {
            declarations.remove(declarations.size() - 1 - i);
        }
        return new ElseStatement(statements);
    }

}
