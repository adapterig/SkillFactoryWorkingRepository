package module6;

public class Deposit extends Account {
    private int period;
    private double percent;


    public Deposit(int balance, int period, double percent) {
        super(balance);
        this.period = period;
        this.percent = percent;
    }

    double withdraw() {
        double b;
        if (period == 0) {
            b = this.balance * (100 + percent) / 100;
            this.balance = 0;
            return b;
        } else {
            return 0;

        }
    }

    void waitDays(int n) {
        if (this.period > n) {
            this.period -= n;
        } else {
            this.period = 0;
        }
    }

    boolean isPeriodExpired() {
        return this.period == 0 ? true : false;
    }
}
