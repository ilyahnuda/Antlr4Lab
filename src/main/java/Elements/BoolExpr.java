package Elements;

import base.Base;
import wallker.MyWalker;
import wallker.Semantic;

public class BoolExpr extends Base {
    private String ax;

    private ExpressionMath left;
    private String compare;
    private ExpressionMath right;
    private String neg;
    private BoolExpr sub;

    public BoolExpr(String ax) {
        this.ax = ax;
        this.compare = null;
    }

    public BoolExpr(String Negotation, BoolExpr boolExpr) {
        this.sub = boolExpr;
        this.ax = null;
        this.compare = null;
        this.neg = Negotation;
    }

    public BoolExpr(ExpressionMath left, String compare, ExpressionMath right) {
        this.left = left;
        Declaration left1 = new Declaration(left.type, left, null, left.getExpr());
        if (MyWalker.declarations.size() == 0) {
            ErrorListener.callErrorDeclaration(left1.getName());
        }
        if (left.kind.equals("id")) {
            System.out.println(left1.getName());
            Semantic.checkContext(MyWalker.declarations, left1);
        }
        Declaration right1 = new Declaration(right.type, right, null, right.getExpr());
        if (MyWalker.declarations.size() == 0) {
            ErrorListener.callErrorDeclaration(right1.getName());
        }
        if (right.kind.equals("id")) {
            Semantic.checkContext(MyWalker.declarations, right1);
        }
        this.compare = compare;
        this.right = right;
        this.ax = null;
        this.sub = null;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        if (ax != null) {
            return ax;
        }
        if (sub != null) {
            return str.append(neg).append("(").append(sub).append(")").toString();
        }
        return str.append(left.toString()).append(compare).append(right.toString()).toString();

    }
}
