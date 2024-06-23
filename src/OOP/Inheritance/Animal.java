package OOP.Inheritance;
class Animal {
    public int x=10;
    public Animal(){
        System.out.println("Default");
    }
    public Animal(String arg) {
        System.out.println("Constructing an animal: " + arg);
    }
}

 class Dog extends Animal {
    public int x=9;
    public Dog() {
        super("From dog");
        System.out.println("Constructing a dog.");
        System.out.println(x);
        System.out.println(super.x);

    }
}

