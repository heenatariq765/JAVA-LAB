class account{
   String accountNumber;
   double balance;

    public account(String accNum, double bal) {
        accountNumber=accNum;
        balance=bal;
    }
void displayAccount(){
    System.out.println("accountNumber:"+accountNumber);
    System.out.println("balance:"+balance);
}
}

class Savingaccount extends account{
   int interestRate;
   int calc;

        public Savingaccount(String accNum, double bal, int rate,int c) {
            super(accNum, bal);
            interestRate=rate;
            calc=c;
        }
public double calculateInterest(){
 return balance*(interestRate/100);
}

public void displayFullDetails(){
    displayAccount();
    System.out.println("interestRate:"+interestRate);
    System.out.println("calc:"+calc);
}
}



public class Main5 {
    public static void main(String[] args) {
        Savingaccount s1=new Savingaccount("ACC123",5000.0,5,5);
        s1.displayFullDetails();
        System.out.println("Calculated Interest: " + s1.calculateInterest());
    }
}
