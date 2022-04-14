package Elements;

import java.util.List;

public class If extends Statement{
    private IfHeader header;
    private List<Statement> ifStatement;
    private ElseStatement elseStatement;

    public If(List<Statement> ifStatement,ElseStatement elseStatement,IfHeader header){
        this.header=header;
        this.ifStatement=ifStatement;
        this.elseStatement=elseStatement;
    }
    @Override
    public String toString(){
        StringBuilder str= new StringBuilder();
        str.append(header.toString()).append("{\n\t\t");
        for(Statement s:ifStatement){
            str.append(s.toString()).append("\n\t\t");
        }
        str.deleteCharAt(str.length()-1);
        str.append("}\n");
        if(elseStatement!=null){
            str.append(elseStatement);
        }
        return str.toString();
    }
}
