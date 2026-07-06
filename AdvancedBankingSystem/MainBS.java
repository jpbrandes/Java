public class MainBS {

    public static void main(String[] args) {

        EnhancedCheckingAccountBS[] accounts = new EnhancedCheckingAccountBS[5];

        accounts[0] = new EnhancedCheckingAccountBS("João Silva", 1000.00, 12345, 500.00, 1);
        accounts[1] = new EnhancedCheckingAccountBS("Maria Oliveira", 1500.00, 12345, 500.00, 1);
        accounts[2] = new EnhancedCheckingAccountBS("Carlos Santos", 2000.00, 12346, 500.00, 1);
        accounts[3] = new EnhancedCheckingAccountBS("Ana Costa", 2500.00, 12347, 500.00, 1);
        accounts[4] = new EnhancedCheckingAccountBS("Pedro Almeida", 3000.00, 67890, 1000.00, 2);

        System.out.println("Account Holder: " + accounts[0].getName());
        System.out.println("Account Number: " + accounts[0].getAccountNumber());
        System.out.println("Balance: $" + accounts[0].getBalance());
        System.out.println("Limit: $" + accounts[0].getLimit());
        System.out.println("Branch: " + accounts[0].getBranch());

        System.out.println("\nAccount Holder: " + accounts[1].getName());
        System.out.println("Account Number: " + accounts[1].getAccountNumber());
        System.out.println("Balance: $" + accounts[1].getBalance());
        System.out.println("Limit: $" + accounts[1].getLimit());
        System.out.println("Branch: " + accounts[1].getBranch());

        System.out.println("\nAccount Holder: " + accounts[2].getName());
        System.out.println("Account Number: " + accounts[2].getAccountNumber());
        System.out.println("Balance: $" + accounts[2].getBalance());
        System.out.println("Limit: $" + accounts[2].getLimit());
        System.out.println("Branch: " + accounts[2].getBranch());

        System.out.println("\nAccount Holder: " + accounts[3].getName());
        System.out.println("Account Number: " + accounts[3].getAccountNumber());
        System.out.println("Balance: $" + accounts[3].getBalance());
        System.out.println("Limit: $" + accounts[3].getLimit());
        System.out.println("Branch: " + accounts[3].getBranch());

        System.out.println("\nAccount Holder: " + accounts[4].getName());
        System.out.println("Account Number: " + accounts[4].getAccountNumber());
        System.out.println("Balance: $" + accounts[4].getBalance());
        System.out.println("Limit: $" + accounts[4].getLimit());
        System.out.println("Branch: " + accounts[4].getBranch());
    }
}
