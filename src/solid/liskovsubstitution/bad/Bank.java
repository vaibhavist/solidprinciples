package solid.liskovsubstitution.bad;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    public static void main(String[] args) {

        List<CommonBankAccount> accountsList = new ArrayList<>();
        accountsList.add(new CommonBankAccount());
        accountsList.add(new PayrollAccount());

        for (CommonBankAccount account : accountsList) {
            account.income(); // accidental calls could lead to unhandled exceptions

            System.out.println("New balance:");
            System.out.println(account.getBalance());
        }
    }
}