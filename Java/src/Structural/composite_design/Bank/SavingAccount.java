package Structural.composite_design.Bank;

class SavingAccount implements Account {
    private String accountNo;
    private float accountBalance;

    public SavingAccount(String accountNo, float accountBalance) {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public float getBalance() {
        return accountBalance;
    }
}