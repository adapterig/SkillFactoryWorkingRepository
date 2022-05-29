package module14.task1461;

import java.util.concurrent.atomic.AtomicInteger;

public class Bank {
    AtomicInteger money = new AtomicInteger();

    public Bank() {
        this.money.set(10000);
    }

    synchronized boolean getLoan(int loan) {
        int result = this.money.get() - loan;
        if (result >= 0) {
            this.money.set(result);
            return true;
        } else return false;
    }

    synchronized void returnLoan(int loan) {
        this.money.addAndGet(loan);
    }
}
