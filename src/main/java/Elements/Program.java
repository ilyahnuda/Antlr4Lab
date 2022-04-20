package Elements;


import base.Base;

import java.util.ArrayList;
import java.util.List;

public class Program extends Base {

    public List<Function> functions;
    public List<Statement> statemnts;
    public List<Declaration> global;

    public Program(List<Function> functionss, List<Statement> statements,List<Declaration> global) {
        functions = functionss;
        this.statemnts= statements;
        this.global=global;

    }

    @Override
    public String toString(){
        StringBuilder str= new StringBuilder();
        for(Declaration d:global){
            str.append("\n\t");
            str.append("public static ");
            str.append(d);

        }
        str.append("\n\n");
        for(Function i : functions){
            str.append(i.toString());
        }
        str.append(" public static void main(String[] args){\n\t");

        for(Statement i : statemnts){
            if (i.getClass().equals(Declaration.class)) {
                if(((Declaration) i).isGlobal){
                    continue;
                }
            }
            str.append(i);
            str.append("\n\t");
        }
        str.append("}\n");
        return str.toString();
    }


}
