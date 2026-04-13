/*Design a BankAccount system:
• balance should be hidden.
• A method withdraw() should only be accessible inside the package.
• A method checkBalance() should be publicly accessible.
• A subclass PremiumAccount (in different package) should still be able to access
some inherited data.
 Use private, protected, default, public properly. */

class BankAccount{
    private double balance;

 public BankAccount(double b){
        balance = b;
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double checkBalance(){
        return balance;
    }
}

public class Main2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println("Current Balance: " + account.checkBalance());
        account.withdraw(200);
        System.out.println("Balance after withdrawal: " + account.checkBalance());
    }
}