package structural_design.composite_design.Bank;

public class Client {

    public static void main(String[] args) {
        CompositeAccount component = new CompositeAccount();
        component.addAccount(new DepositeAccount("DA001", 100));
        component.addAccount(new DepositeAccount("DA002", 150));
        component.addAccount(new SavingAccount("SA001", 200));
        float totalBalance = component.getBalance();
        System.out.println("Total Balance : " + totalBalance);
    }

}