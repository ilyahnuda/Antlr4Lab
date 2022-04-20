package Elements;

import wallker.MyWalker;

public class ExpressionMath extends Statement{
    private String expr;
    public String type;
    public String kind;
    public ExpressionMath(String str){
        this.kind="id";
        this.expr=str;

        for(var i : MyWalker.declarations){
            if(i.getName().equals(expr)){
                this.type=i.getType();
                return;
            }
        }
        for(var i : MyWalker.global){
            if(i.getName().equals(expr)){
                this.type=i.getType();
                return;
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

