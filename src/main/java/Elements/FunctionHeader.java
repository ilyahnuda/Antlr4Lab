package Elements;

import base.Base;

public class FunctionHeader extends Base {
    private String type;
    private FunctionParameter fP;
    private String name;

    public FunctionHeader(String type,String name,FunctionParameter fP){
        this.type=type;
        this.fP=fP;
        this.name=name;
    }

    @Override
    public String toString(){
        return "public static "+type+" "+ name + "("+fP.toString()+")";
    }

    public String getName() {
        return name;
    }
    public FunctionParameter getfP(){
        return fP;
    }

    public String getType() {
        return type;
    }
}
