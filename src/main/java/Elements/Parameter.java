package Elements;

import wallker.MyWalker;

import java.util.ArrayList;
import java.util.List;

public class Parameter {
    private String type;
    private String name;

    public  Parameter(String type,String name){
        this.type=type;
        this.name=name;
        Declaration d=new Declaration(type,new NUMBER("0"),null,name);
        MyWalker.declarations.add(d);

    }
    @Override
    public String toString(){
        return type+ " "+ name;
    }
}
