package Elements;

public class ErrorListener  {

    public ErrorListener(String name){
        System.out.println(name);
        System.exit(0);
    }
    public static void callErrorFuncNotFound(String name){
        System.out.println("Error function call  " + name);
        System.exit(0);
    }
    public static void callErrorAssign(String id,String expres){
        System.out.println("Unknown var for assign:("+id +","+expres+")");
        System.exit(0);
    }
    public static void callErrorDeclaration(String id){
        System.out.println("Unknown var:("+id+")");
        System.exit(0);
    }
    public  static  void callErrorIncorrectTypeRes(String type1,String type2){
        System.out.println("Not provided types in func :("+type1+","+type2+")");
        System.exit(0);
    }
    public static void callErrorIncorrectCast(String expr,String type,String type2){
        System.out.println("Cast error:"+expr+";\n Cannot cast from "+type2+" to "+type);
        System.exit(0);
    }
    public static void callErrorOverload(String func){
        System.out.println("Overload cannot be implemeted in program. We have func with name:"+func);
        System.exit(0);
    }
    public static void callErrorContext(String name){
        System.out.println("We already have this var:"+name);
        System.exit(0);
    }
    public static void callErrorAssignConst(String name){
        System.out.println("Error.You cannot change value for const var:"+name);
        System.exit(0);
    }
}
