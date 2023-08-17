public class SavingsAccount extends BankAccount {

    public SavingsAccount(String name, double newBalance) {
        super(name, newBalance);
    }

    @Override
    public void checkBalance() {
        System.out.println("This is a savings account");
        super.checkBalance();
    }
}
