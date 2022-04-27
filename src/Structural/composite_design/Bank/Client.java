package Structural.composite_design.Bank;

public class Client {

    public static void main(String[] args) {
        CompositeAccount component = new CompositeAccount();

        SavingAccount savingAccount = new SavingAccount("SA001", 200);
        DepositAccount depositeAccount = new DepositAccount("DA002", 150);

        component.addAccount(savingAccount);
        component.addAccount(depositeAccount);

        System.out.println("Balance for saving account is " + savingAccount.getBalance());
        System.out.println("Balance for deposit account is " + depositeAccount.getBalance());

        System.out.println("Total Balance : " + component.getBalance());
    }

}