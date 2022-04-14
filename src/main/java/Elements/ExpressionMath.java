package Elements;

import wallker.MyWalker;

import java.util.ArrayList;
import java.util.List;

public class ExpressionMath extends Statement{
    private String expr;
    public String type;
    public String kind;
    public ExpressionMath(String str){
        this.kind="id";
        this.expr=str;

        for(var i : Program.stack__id){
            if(i.get(0).equals(expr)){
                this.type=i.get(1);
            }
        }
    }
    public ExpressionMath(FloatNumber floatNumber){
        this.kind="floatnumber";
        this.type="float";
        this.expr=floatNumber.value;
    }
    public ExpressionMath(NUMBER number){
        this.kind="intnumber";
        this.type="int";
        this.expr=number.value;
    }
    public ExpressionMath() {
    }

    public String getExpr() {
        return expr;
    }

    @Override
    public String toString(){
        return expr;
    }
}

