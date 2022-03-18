package module6;

public class CheckingAccount extends Account {
    public CheckingAccount(int n) {
        super(n);
    }

    @Override
    void withdraw(int n) {
        this.balance -= n;
    }

    int getDebt() {
        if (this.balance < 0) {
            return -this.balance;
        } else {
            return 0;
        }
    }

}
