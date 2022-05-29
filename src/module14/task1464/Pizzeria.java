package module14.task1464;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

class Pizzeria {
    LinkedBlockingQueue<Order> orders = new LinkedBlockingQueue<>(2);

    void order(String pizzaName) throws InterruptedException {
        if (orders.offer(new Order(pizzaName, System.currentTimeMillis()), 250, TimeUnit.MILLISECONDS)) {
            System.out.println(pizzaName + "is delivered");
        } else {
            System.out.println(pizzaName + "is NOT delivered");
        }
    }

    class Order extends Thread {
        String pizzaName;
        long orderTime;

        public Order(String pizzaName, long orderTime) {
            this.pizzaName = pizzaName;
            this.orderTime = orderTime;
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


