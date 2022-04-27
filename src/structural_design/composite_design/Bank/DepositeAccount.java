package structural_design.composite_design.Bank;

class DepositeAccount extends Account {
    private String accountNo;
    private float accountBalance;

    public DepositeAccount(String accountNo, float accountBalance) {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public float getBalance() {
        return accountBalance;
    }

}