package BankingSystemEnhanced;

public class EnhancedCheckingAccountBS {

    private String name;
    private int accountNumber;
    private double balance;
    private double limit;
    private int branch;

    public EnhancedCheckingAccountBS(String name, double balance, int accountNumber, double limit, int branch) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.limit = limit;
        this.branch = branch;
    } // Constructor used to initialize the account attributes. A constructor is used to create instances of a class.

    public EnhancedCheckingAccountBS(String name, double balance, int accountNumber, int branch) { // Constructor overloading is a technique that allows creating multiple constructors with different parameters.
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.branch = branch;
    }

    public EnhancedCheckingAccountBS(String name, int accountNumber, int branch) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.branch = branch; // This code contains three constructors for different scenarios.
    }

    // Getter methods to access the attribute values.
    public String getName() {
        return this.name;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getLimit() {
        return this.limit;
    }

    public int getBranch() {
        return this.branch;
    }

    // Setter methods to assign values to the attributes.
    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public void updateBalance(double balance) {
        this.balance = balance;
    }

    public void updateLimit(double limit) {
        this.limit = limit;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public void updateAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit of $" + amount + " completed successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void printData() {
        System.out.println("Account Holder: " + this.name);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Branch: " + this.branch);
        System.out.println("Balance: $" + this.balance);
        System.out.println("Limit: $" + this.limit);
    }

}
