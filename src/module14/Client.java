package module14;

public class Client extends Thread {
    int loan;
    Bank bank;

    public Client(Bank bank) {
        this.loan = 1000;
        this.bank = bank;
    }

    public void run() {
        while (true) {
            if (bank.getLoan(loan)){
            bank.returnLoan(loan);}
        }
    }

}
