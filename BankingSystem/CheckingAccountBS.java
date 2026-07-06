public class CheckingAccountBS {

    private String accountHolder;
    private double balance;

    public CheckingAccountBS(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit and withdraw money from the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " completed successfully."); // String concatenation to display the deposited amount
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " completed successfully."); // String concatenation to display the withdrawn amount
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}
