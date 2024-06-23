package Multithreading;
 class mltithreading implements Runnable {
    public void run(){
        System.out.println("Inside run");
    }
   public static void main(String[] args){
    mltithreading t=new mltithreading();
    Thread T=new Thread(t);
    T.start();
    T.setName("hey");
    System.out.println(T.getName());
   }
}
