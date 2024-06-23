package OOP.interfaceandImplementation;

interface intfA {
    void m1();
}

interface intfB {
    void m1();
}

// class implements both interfaces
// and provides implementation to the method.
class sample implements intfA, intfB {

    public void m1() {
        System.out.println("Welcome: inside the method m1");
    }

//     @Override
//     public void m2() {
//         System.out.println("Welcome: inside the method m2");
//     }
 }
