package module14.task1464;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

class Pizzeria {
    LinkedBlockingQueue<Order> orders = new LinkedBlockingQueue<>(2);

    void order(String pizzaName) throws InterruptedException {
        if (orders.offer(new Order(pizzaName), 250, TimeUnit.MILLISECONDS)) {
            System.out.println(pizzaName + "is delivered");
        } else {
            System.out.println(pizzaName + "is NOT delivered");
        }
    }

    class Order extends Thread {
        String pizzaName;


        public Order(String pizzaName) {
            this.pizzaName = pizzaName;
            this.start();
        }

        public void run() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            orders.poll();
        }
    }
}


