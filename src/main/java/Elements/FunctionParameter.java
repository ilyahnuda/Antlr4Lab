package Elements;

import base.Base;

import java.util.List;

public class FunctionParameter extends Base {
    private List<Parameter> params;

    public FunctionParameter(List<Parameter> params){
        this.params=params;
    }
    @Override
    public String toString(){
        StringBuilder str= new StringBuilder();

        for (Parameter param : params) {
            str.append(param.toString()).append(",");
        }
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }

    public List<Parameter> getParams() {
        return params;
    }
}
