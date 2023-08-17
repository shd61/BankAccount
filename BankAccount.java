public class BankAccount {
     String accHolderName;
     double balance;
     static double minimumBalance = 500;
     double annualInterest;

   
    public BankAccount() {
        accHolderName = null;
        balance = 0;
        annualInterest = 0;
    }

   
    public BankAccount(String name, double newBalance) {
        accHolderName = name;
        balance = newBalance;
        annualInterest = 0;
    }

    public void checkDeposit(double initialDeposit) {
        if (initialDeposit < minimumBalance) {
            System.out.println("Initial deposit should be at least: " + minimumBalance);
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (balance < amount + minimumBalance) {
            System.out.println("Insufficient balance to withdraw.");
            return 0;
        } else {
            balance -= amount;
            return amount;
        }
    }

    public void checkBalance() {
        System.out.println("Account Holder: " + accHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
       
        BankAccount account1 = new BankAccount("Theekshana", 1000);
        account1.checkBalance();
        account1.deposit(500);
        account1.checkBalance();
        double withdrawnAmount = account1.withdraw(300);
        if (withdrawnAmount > 0) {
            System.out.println("Withdrawn amount: " + withdrawnAmount);
        }
        account1.checkDeposit(200);
    }
}
