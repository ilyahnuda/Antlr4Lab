package Elements;

import wallker.MyWalker;
import wallker.Semantic;

public class Declaration extends Statement{
    private String type;
    private String secondType;
    private ExpressionMath statement;
    private String name;
    public boolean isGlobal=false;
    public boolean isConst=false;

    public Declaration(String type,ExpressionMath st,String secondType,String name,String global,String cons){
        this.type=type;
        this.secondType=secondType;
        this.statement=st;
        this.name=name;
        for(Declaration d:MyWalker.global){
            if(d.name.equals("name")){
                return;
            }
        }
        Semantic.checkDoubleDeclaration(name);
        String secondTypes;
        if(secondType!=null){
            secondTypes=secondType;
        }
        else{
            secondTypes=st.type;
        }
        Semantic.checkCorrectCast(type,secondTypes,toString());
        if(global!=null){
            isGlobal=true;
        }
        if(cons!=null){
            isConst=true;
        }
    }
    @Override
    public String toString(){
        StringBuilder res=new StringBuilder();
        if(isConst){
            res.append("final ");
        }
        res.append(type).append(" ").append(name).append(" = ");
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
