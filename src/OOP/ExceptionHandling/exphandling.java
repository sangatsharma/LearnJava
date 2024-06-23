package OOP.ExceptionHandling;

class expHandling {

    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("No print");
        } catch (Exception e) {
            System.out.println("Error "+e);
            // throw e;
        } finally {
            System.out.println("statement in finally block");

        }
    }

}
