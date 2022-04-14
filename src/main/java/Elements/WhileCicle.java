package Elements;

import java.util.List;

public class WhileCicle extends Statement {
    private WhileHeader whileHeader;
    private List<Statement> statementList;
    public WhileCicle(WhileHeader whileHeader, List<Statement> statementList)
    {
        this.whileHeader=whileHeader;
        this.statementList=statementList;
    }
    @Override
    public String toString(){
        StringBuilder str= new StringBuilder();
        str.append(whileHeader.toString()).append("{\n\t\t");
        for(Statement i:statementList){
            str.append(i.toString()).append("\n\t\t");
        }
        str.deleteCharAt(str.length()-1);
        str.append("}\n");
        return str.toString();
    }

}
