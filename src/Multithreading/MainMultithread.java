package Multithreading;

public class MainMultithread extends Thread {
    public void run()  {
        for (int i = 0; i < 10; i++) {
            System.out.println("from thread: " + currentThread().getName() + ": " + i);

            try {
                if ((currentThread().getName() == "first") && (i == 6)) {
                    System.out.println("First exit");
                    currentThread().join();
                    currentThread().sleep(100);
                }
            } catch (Exception e) {
                System.out.println("interrupted");
            }
        }


    }

    public static void main(String[] args)throws Exception {
        MainMultithread obj1 = new MainMultithread();
        MainMultithread obj2 = new MainMultithread();
        obj1.setName("first");
        obj2.setName("second");
        obj1.start();
        obj2.start();
        // Thread T=Thread.currentThread();
        // System.out.println("Current thread name :"+T.getName());
        // T.setName("demo");
        // System.out.println("Current thread name :"+T.getName());
    }
}
