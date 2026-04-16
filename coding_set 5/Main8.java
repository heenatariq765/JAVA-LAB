
class BankAccount {

        int balance=2000;
         void withdrwal( int amount){
            if(amount > balance){
                throw new ArithmeticException("insufficient balance");
            }
            else{
                amount-=balance;
            System.out.println("remaining balance " + balance);
            System.out.println("witndrwal Amount"+amount);
        } 
    }
}
        public class Main8 {
    public static void main(String[] args){
        BankAccount b1= new BankAccount();
         
       b1.withdrwal(700);
    }
  }

