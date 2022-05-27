package unsorted.test;

public class Main {

    public static void main(String[] args)  {
        Thread loadImages = new LoadingThread();
        loadImages.start();
        try {
            loadImages.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Images are loaded");

    }

}

class LoadingThread extends Thread {
}