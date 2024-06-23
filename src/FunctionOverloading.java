 class FunctionOverloading {
    void overload(){
        System.out.println("No parameter");
    }
    void overload(int y){
        System.out.println("integer parameter");
    }
    void overload(String name){
        System.out.println("string parameter");
    }
    public static void main(String[] args){
        FunctionOverloading obj1=new FunctionOverloading();
        obj1.overload();
        obj1.overload(10);
        obj1.overload("string");
    }
}
