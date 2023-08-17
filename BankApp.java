public class BankApp {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount("Theekshana", 1500);
        SavingsAccount account2 = new SavingsAccount("chalindu", 2000);

        account1.checkBalance();
        account1.deposit(300);
        account1.checkBalance();
        double withdrawnAmount = account1.withdraw(800);
        System.out.println("Amount withdrawn: " + withdrawnAmount);
        account1.checkBalance();

        System.out.println();

        account2.checkBalance();
        account2.deposit(500);
        account2.checkBalance();
        withdrawnAmount = account2.withdraw(1800);
        System.out.println("Amount withdrawn: " + withdrawnAmount);
        account2.checkBalance();
    }
}
