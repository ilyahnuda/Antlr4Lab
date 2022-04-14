package Elements;
import wallker.MyWalker;

import java.util.ArrayList;
import java.util.List;


public class FunctionCall extends  ExpressionMath{
    private String id;
    private List<ExpressionMath> params;
    public FunctionCall(String id , List<ExpressionMath> params){
        this.id=id;
        this.params=params;


       int checker=0;
        for(Function i:MyWalker.functions){
            if(i.functionHeader.getName().equals(id)){
                checker++;
                if(i.functionHeader.getfP().getParams().size()==params.size()){
                    checker++;
                }
            }
            if(checker==2){
                return;
            }
        }
        ErrorListener.callErrorFuncNotFound(toString());


    }
    @Override
    public String toString(){
        StringBuilder res=new StringBuilder();
        res.append(id).append("(");
        for(ExpressionMath e : params){
            res.append(e.toString()).append(",");
        }
        res.deleteCharAt(res.length()-1);
        res.append(");");
        return res.toString();
    }
}
