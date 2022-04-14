package Elements;

import base.Base;

public class WhileHeader extends Base {
    private  BoolExpr boolExpr;

    public WhileHeader(BoolExpr b){
        this.boolExpr=b;
    }

    @Override
    public String toString(){
        return "while("+boolExpr.toString()+")";
    }
}
