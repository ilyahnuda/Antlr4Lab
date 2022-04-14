package Elements;

import java.util.ArrayList;
import java.util.List;

public class Parameter {
    private String type;
    private String name;

    public  Parameter(String type,String name){
        this.type=type;
        this.name=name;
        List<String> buf =new ArrayList<>();
        buf.add(name);
        buf.add(type);
        Program.stack__id.add(buf);

    }
    @Override
    public String toString(){
        return type+ " "+ name;
    }
}
