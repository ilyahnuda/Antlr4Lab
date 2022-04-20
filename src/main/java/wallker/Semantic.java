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

    public static void checkContext(List<Declaration> subProgram, String name) {
        for (Declaration s : subProgram) {
            if (name.equals(s.getName())) {
                ErrorListener.callErrorContext(name);
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
                ErrorListener.callErrorIncorrectCast(expression,type,secondType);
            }
        }
    }

    public static void checkDoubleDeclaration(String name){
        for(Declaration d : MyWalker.declarations){
            if(d.getName().equals(name)){
                ErrorListener.callErrorContext(name);
            }
        }
    }

    public static void checkCorrectAssignment(String name,String expr){
        for(Declaration d:MyWalker.declarations){
            if(d.getName().equals(name)){
                if(d.isConst){
                    ErrorListener.callErrorAssignConst(d.getName());
                }
                return;
            }
        }
        for(Declaration s:MyWalker.global){
            if (name.equals(s.getName())) {
                if(s.isConst){
                    ErrorListener.callErrorAssignConst(s.getName());
                }
                return;
            }
        }
        ErrorListener.callErrorAssign(name,expr);
    }

}
