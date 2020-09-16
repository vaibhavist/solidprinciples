package solid.liskovsubstitution.good;

public class CommonBankAccount {

    private AccountManager manager;

    public CommonBankAccount() {
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

    public void income() {
        this.manager.income(0.02);
    }

    @Override
    public String toString() {
        return "Account balance-> " + this.getBalance();
    }
}
