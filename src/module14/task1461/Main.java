package module14.task1461;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client1 = new Client(bank);
        Client client2 = new Client(bank);
        Client client3 = new Client(bank);
        client1.start();
        client2.start();
        client3.start();
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(bank.money);
        }

    }
}
