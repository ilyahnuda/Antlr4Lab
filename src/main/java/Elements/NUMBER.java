package Elements;

public class NUMBER extends ExpressionMath{
    public String value;
    public NUMBER(String str){
        this.value=str;
    }
    @Override
    public String toString(){
        return value;
    }
}
