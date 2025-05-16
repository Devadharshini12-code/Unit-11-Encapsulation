// Encapsulation Example in One Program

class BankAccount {
    // Private data: cannot be accessed directly
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount(1000.0);

        // Interacting with the account using methods
        account.deposit(500.0);
        account.withdraw(200.0);

        // Getting and displaying the balance
        System.out.println("Current Balance: " + account.getBalance());
    }
}