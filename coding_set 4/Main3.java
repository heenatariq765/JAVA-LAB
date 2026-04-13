/* ATM Withdrawal System
Simulate an ATM:
•
User enters amount.
•
If amount > balance → throw exception.
•
If amount is negative → throw another exception.
•
If input is invalid (non-numeric) → handle properly.
Use multiple catch blocks + meaningful messages.*/

class ATM{
    private double balance;

    public ATM(double initialBalance) {
        balance = initialBalance;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient funds. Available balance: " + balance);
        } else if (amount < 0) {
            throw new Exception("Invalid amount. Amount cannot be negative.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}


