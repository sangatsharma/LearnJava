package OOP;

import java.lang.reflect.*;

public class Reflection {
    private int num;

    public Reflection() {
        System.out.println("constructorrrrrrrrrrr");
    }

    public Reflection(int num) {
        this.num = num;
        System.out.println("constructorrrrrrrrrrr"+num);
    }

    public void shownum() {
        System.out.println(num);
    }

    public static void main(String[] args) throws Exception {
        Reflection obj1 = new Reflection(20);
        // gives class info
        Class cls = obj1.getClass();
        System.out.println(cls.getName());
        int COUNT = 0;
        Constructor[] constructor = cls.getDeclaredConstructors();
        for (Constructor constructor2 : constructor) {

            COUNT++;
        }
        System.out.println(COUNT);
        int m=cls.getModifiers();
        System.out.println(Modifier.toString(m));
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
        System.out.println(method.getName());
        }
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
        System.out.println(field.getName());
        }
        fields[0].setAccessible(true);
        fields[0].set(obj1, 90);
        System.out.println(fields[0].getName());
        methods[1].setAccessible(true);
        methods[1].invoke(obj1);
        constructor[0].setAccessible(true);
        constructor[1].setAccessible(true);
        constructor[0].newInstance();
        constructor[1].newInstance(10);
    }
}
