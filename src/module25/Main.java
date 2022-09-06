package module25;

public class Main {

    public static void main(String[] args) {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
       /* try {
            int i = 25 / 0;
            //throw new IllegalArgumentException();
        } catch (Exception e) {
            for (StackTraceElement element : stack) {
                System.out.println(element);
            }
        }*/
        //throw new IllegalArgumentException();

        if (stack.length == 0) {
            System.out.println("Collection is empty");
        } else {
            int i = 1;
            for (StackTraceElement element : stack) {
                System.out.println(i + " " + element);
                i++;
            }

        }
    }
}