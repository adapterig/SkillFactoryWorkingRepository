package module13.task43;

public class Main extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Thread started");
            Thread.sleep(100);
        } catch (InterruptedException exception) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Main();
        thread.start();
        Thread.currentThread().sleep(2500);
        thread.interrupt();
    }
}
