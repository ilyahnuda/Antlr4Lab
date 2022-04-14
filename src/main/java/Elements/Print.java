package Elements;

public class Print extends Statement{
    private Statement expr;
    public Print(ExpressionMath expr){
        this.expr=expr;
    }

    @Override
    public String toString(){
        return String.format("System.out.println(%s);",expr.toString());
    }
    @Override
    public Object eval(){
        System.out.println(expr.eval());
        return null;
    }
}
