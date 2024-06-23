import java.util.ArrayList;

public class ArrayListInjava {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("Momo");// add item to food object of arraylist
        food.add("Burger");
        food.add("pizza");
        food.set(0, "sushi");// re set or replace value in particular index
        for (int i = 0; i < food.size(); i++) {// printall item in list
            System.out.println(food.get(i));
        }
        food.remove(1);// remove Burger or index 1 item
        for (int i = 0; i < food.size(); i++) {// printall item in list
            System.out.println(food.get(i));
        }
        food.clear();// clear list
        for (int i = 0; i < food.size(); i++) {// printall item in list
            System.out.println(food.get(i));
        }
    }

}
