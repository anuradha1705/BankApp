// Base class
class BankAccount {
    String accountHolder;
    double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        }
    }

    // Method to display account info
    public void displayInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Derived class
class SavingsAccount extends BankAccount {
    double interestRate;

    // Constructor
    public SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Overriding method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    // Method to add interest
    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest of " + interest + " added. New balance: " + balance);
    }
}

// Main class
public class managementSystem {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("Anjali", 5000, 3.5);
        acc.displayInfo();
        acc.deposit(2000);
        acc.withdraw(1000);
        acc.addInterest();
    }
}
