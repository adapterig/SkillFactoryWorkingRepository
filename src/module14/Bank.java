package module14;

public class Bank {
    int money;

    public Bank() {
        this.money = 10000;
    }

    synchronized boolean getLoan(int loan) {
        if (this.money - loan >= 0) {
            this.money -= loan;
            return true;
        } else return false;
    }

    synchronized void returnLoan(int loan) {
        this.money += loan;
    }
}
