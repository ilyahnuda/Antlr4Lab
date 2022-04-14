package Elements;


import base.Base;

import java.util.ArrayList;
import java.util.List;

public class Program extends Base {

    public List<Function> functions;
    public List<Statement> statemnts;
    public static List<String> stack_id=new ArrayList<>();
    public static List<List<String>> stack__id= new ArrayList<>();

    public Program(List<Function> functionss, List<Statement> statements) {
        functions = functionss;
        this.statemnts= statements;

    }

    @Override
    public String toString(){
        StringBuilder str= new StringBuilder();
        for(Function i : functions){
            str.append(i.toString());
        }
        str.append(" public static void main(String[] args){\n\t");

        for(Statement i : statemnts){
            str.append(i.toString());
            str.append("\n\t");
        }
        str.append("}\n");
        return str.toString();
    }

    public List<Function> getFunctions() {
        return functions;
    }
}
