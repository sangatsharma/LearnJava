import java.util.ArrayList;
public class foreachloop {
    public static void main(String[] args){
        //String[] animals={"cat","dog","tiger"};
        ArrayList<String> animals=new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("tiger");
        for (String i:animals){
            System.out.println(i);
        }
    }    
}
