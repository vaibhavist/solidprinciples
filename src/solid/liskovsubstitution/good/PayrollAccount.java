package solid.liskovsubstitution.good;

public class PayrollAccount {

    private AccountManager manager;

    public PayrollAccount() {
        this.manager = new AccountManager();
    }

    public void deposit(double value) {
        this.manager.deposit(value);
    }

    public void cashOut(double value) {
        this.manager.cashOut(value);
    }

    public double getBalance() {
        return this.manager.getBalance();
    }

    @Override
    public String toString() {
        return "Account balance-> " + this.getBalance();
    }
}
