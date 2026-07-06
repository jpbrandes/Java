public class MainBS {

    public static void main(String[] args) { // Standard line for the main method in Java

        CheckingAccountBS account1 = new CheckingAccountBS("João Silva", 1000.00); // Creates a checking account with an account holder and an initial balance

        System.out.println("Account Holder: " + account1.getAccountHolder());
        System.out.println("Initial Balance: $" + account1.getBalance()); // String concatenation to display the initial balance

        account1.deposit(500.00);
        System.out.println("Balance after deposit: $" + account1.getBalance());

        account1.deposit(-200.00); // Invalid deposit test
        System.out.println("Balance after invalid deposit: $" + account1.getBalance());

        System.out.println("Balance after withdrawal: $" + account1.getBalance());
    }
}
