package structural_design.composite_design.Bank;

import java.util.ArrayList;

class CompositeAccount extends Account {
    private final ArrayList<Account> accountList = new ArrayList<>();

    public float getBalance() {
        float totalBalance = 0;
        for (Account f : accountList) {
            totalBalance = totalBalance + f.getBalance();
        }
        return totalBalance;
    }

    public void addAccount(Account acc) {
        accountList.add(acc);
    }

    public void removeAccount(Account acc) {
        accountList.add(acc);
    }
}