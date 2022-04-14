package Elements;

import base.Base;

public abstract class Statement extends Base {
    @Override
    public boolean equals(Object o){
        return this.toString().equals(o.toString());
    }
    @Override
    public  Object eval(){
        return null;
    }
}
