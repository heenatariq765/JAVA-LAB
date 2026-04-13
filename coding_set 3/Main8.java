//create class order with id and amount...create subclass online order with delivery charges...calculate final bill using super.
class Order{
    int orderID;
    double amount;

    public Order(int o, double a) {
        orderID=o;
        amount=a;
    }
void displayOrder(){
    System.out.println("orderId:"+orderID);
    System.out.println("amount:"+ amount);
}
}

class OnlineOrder extends Order{
   int deliveryCharge;

        public OnlineOrder(int o, double a, int d) {
            super(o, a);
            deliveryCharge=d;
        }
 void bill(){
    double finalBill=amount+deliveryCharge;
    System.out.println("final bill:"+finalBill);

public void displayFullDetails(){
    displayOrder();
    System.out.println("deliveryCharges:" + deliveryCharge);
}
}


public class Main8 {
    public static void main(String[] args) {
        OnlineOrder s1=new OnlineOrder(100,500.0,50);
        s1.displayFullDetails();
    }
}

