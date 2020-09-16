package solid.liskovsubstitution.bad;

public class PayrollAccount extends CommonBankAccount {

    @Override
    public void income() {
        throw new RuntimeException("This account has no income");
    }

}
