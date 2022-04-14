package Elements;

import base.Base;

import java.util.List;

public class ElseStatement extends Base {
    List<Statement> stat;

    public ElseStatement(List<Statement> stat){
        this.stat=stat;
    }

    @Override
    public String toString(){
        StringBuilder str= new StringBuilder();
        str.append("\telse{\n\t\t");
        for(Statement i:stat){
            str.append(i).append("\n\t\t");
        }
        str.deleteCharAt(str.length()-1);
        str.append("}\n");
        return str.toString();

    }
}
