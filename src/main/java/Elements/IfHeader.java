package Elements;

import base.Base;

public class IfHeader extends Base {
    BoolExpr boolExpr;
    public IfHeader(BoolExpr b)
    {
        this.boolExpr=b;
    }
    @Override
    public String toString(){
        return "if("+boolExpr.toString()+")";
    }

}
