package Elements;

import wallker.Semantic;

public class Assigment extends Statement{

    private String type;
    private ExpressionMath statement;
    private String name;

    public Assigment(String type,ExpressionMath st,String name){
        this.type=type;
        this.statement=st;
        this.name=name;
        Semantic.checkCorrectAssignment(name,toString());
    }
    @Override
    public String toString(){
        StringBuilder res=new StringBuilder(name+" = ");
        if(type!=null){
            res.append("(").append(type).append(")");
        }
        res.append(statement.toString()).append(";");
        return res.toString();
    }
}
