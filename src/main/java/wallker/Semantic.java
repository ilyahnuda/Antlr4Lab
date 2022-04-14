package wallker;

import Elements.*;

import java.util.List;

public class Semantic {


    public static void checkOverload(String name,List<Function> functionList) {
        for (Function f : functionList) {
            if (name.equals(f.functionHeader.getName())) {
                ErrorListener.callErrorOverload(name);
            }
        }
    }

    public static void checkContext(List<Declaration> subProgram, Declaration d) {
        for (Declaration s : subProgram) {
            if (d.getName().equals(s.getName())) {
                ErrorListener.callErrorContext(d.getName());
            }
        }
    }

    public static void checkCorrectReturnValue(ExpressionMath res, List<Statement> statements, String typeHeader) {
        String typeRes = "";
        int counter = 0;
        if (res.kind.equals("id")) {
            for (Statement i : statements) {
                if (i.getClass() == Declaration.class) {
                    System.out.println(res.getExpr());
                    if (((Declaration) i).getName().equals(res.getExpr())) {
                        typeRes = ((Declaration) i).getType();
                        counter++;
                    }
                }
            }
            if (counter != 1) {
                ErrorListener.callErrorDeclaration(res.getExpr());
            }
        } else {
            typeRes = res.type;
        }

        if (!typeHeader.equals(typeRes)) {
            ErrorListener.callErrorIncorrectTypeRes(typeRes, typeHeader);
        }
    }

    public static void checkCorrectCast(String type,String secondType,String expression){
        if(secondType!=null){
            if(!type.equals(secondType)){
                ErrorListener.callErrorIncorrectCast(expression,type);
            }
        }
    }

    public static void checkDoubleDeclaration(String name,String expr){
        if(Program.stack_id.contains(name)){
            ErrorListener.callErrorAssign(name,expr);
        }
    }

    public static void checkCorrectAssignment(String name,String expr){
        if(!Program.stack_id.contains(name)){
            ErrorListener.callErrorAssign(name,expr);
        }
    }

}
