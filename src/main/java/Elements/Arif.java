package Elements;

import base.Base;

import java.beans.Expression;

public class Arif extends ExpressionMath {
    private  ExpressionMath left;
    private ExpressionMath right;
    private String op;
    public String type;
    public Arif(ExpressionMath left,String op,ExpressionMath right){
        this.left=left;
        this.op=op;
        this.right=right;
        if(!left.type.equals(right.type)){
            ErrorListener.callErrorIncorrectTypeRes(left.type, right.type);
        }
        super.type=left.type;
    }
    @Override
    public String toString(){
        return left.toString()+op+ right.toString();
    }
}
