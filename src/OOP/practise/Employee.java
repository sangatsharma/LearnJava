package OOP.practise;

public class Employee {
    private int id;
    private String name;
    private String Post;
    private int salary;
    public Employee(int id,String name,String Post,int salary){
        this.id=id;
        this.name=name;
        this.Post=Post;
        this.salary=salary;
    }
    public String toString(){
        return id+" "+name+" "+Post+" "+salary;
    }
    public static void main(String[] args){
        Employee e1=new Employee(1, "Sangat Sharma", "Officer", 1000);
        System.out.println(e1);
    }

}
