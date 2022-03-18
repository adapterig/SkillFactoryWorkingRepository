package module6;

public class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    void withdraw(int n) {
        if (this.balance > n) {
            this.balance -= n;
        } else {
            this.balance = 0;
        }
    }

    void put(int n) {
        this.balance += n;
    }

    int checkBalance() {
        return this.balance;
    }
}
