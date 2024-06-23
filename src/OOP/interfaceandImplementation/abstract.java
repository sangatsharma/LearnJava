package OOP.interfaceandImplementation;

abstract class shape {
    abstract void show();
    void doshoe(){
       System.out.println("sgdsdsd"); 
    }
}
class circle extends shape{
     void show(){
        System.out.println("circle");
    }
}
class rect extends shape{
     void show(){
        System.out.println("rect");
    }
    public static void main(String args[]){
        shape obj1=new circle();
    }
}
