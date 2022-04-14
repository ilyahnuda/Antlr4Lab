package Elements;

import wallker.Semantic;

import java.util.ArrayList;
import java.util.List;

public class Declaration extends Statement{
    private String type;
    private String secondType;
    private ExpressionMath statement;
    private String name;

    public Declaration(String type,ExpressionMath st,String secondType,String name){
        this.type=type;
        this.secondType=secondType;
        this.statement=st;
        this.name=name;
        Semantic.checkDoubleDeclaration(name,toString());
        String secondTypes;
        if(secondType!=null){
            secondTypes=secondType;
        }
        else{
            secondTypes=st.type;
        }
        Semantic.checkCorrectCast(type,secondTypes,toString());
        Program.stack_id.add(this.name);
        List<String> buf =new ArrayList<>();
        buf.add(name);
        buf.add(type);
        Program.stack__id.add(buf);
    }
    @Override
    public String toString(){
        StringBuilder res=new StringBuilder(type+" "+name+" = ");
        if(secondType!=null){
            res.append("(").append(secondType).append(")");
        }
        res.append(statement.toString()).append(";");
        return res.toString();
    }

    public String getName() {
        return name;
    }
    public String getType(){
        return type;
    }
}
