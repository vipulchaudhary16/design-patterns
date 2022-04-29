package Structural.composite_design.Bank;

class DepositAccount implements Account {
    private String accountNo;
    private float accountBalance;

    public DepositAccount(String accountNo, float accountBalance) {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public float getBalance() {
        return accountBalance;
    }

    public String getAccountNo() {
        return accountNo;
    }
}