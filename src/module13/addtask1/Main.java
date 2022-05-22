package module13.addtask1;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    static final ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) {

        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();

    }
}

class Thread1 extends Thread {
    public void run() {
        Random random = new Random();
        while (true) {
            try {
                Main.queue.put(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        Random random = new Random();
        while (true) {
            try {
                Thread.sleep(100);
                if (random.nextInt(10) == 5) {
                    System.out.println(Main.queue);
                    Main.queue.take();

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
