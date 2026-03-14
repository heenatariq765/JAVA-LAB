/* Create a class BankAccount with attributes accountHolderName and balance. Use a constructor to initialize them and implement a method to deposit money and display the updated balance.*/
class BankAccount{
    String accountHolderName;
    double balance;
BankAccount(String a,double b){
    accountHolderName=a;
    balance=b;
}
void deposit(double amount){
    balance+=amount;
    System.out.println("amount deposited :" + " " + amount);
}
void display(){
    System.out.println("Account Holder Name :" + " "+ accountHolderName);
    System.out.println("Balance :" + " "+ balance);
}
}
public class Main9{
    public static void main(String[] args) {
        BankAccount b= new BankAccount("Sneha", 5000);
        b.deposit(2000);
        b.display();
    }
}