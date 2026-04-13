class product{
  protected String name;
  protected  int price;

    public product(String n, int p) {
        name=n;
        price=p;
    }
void displayProduct(){
    System.out.println("name:"+name);
    System.out.println("price:"+price);
}
}

class Electronics extends product{
   int warrantyPeriod;

        public Electronics(String n, int p, int w) {
            super(n, p);
            warrantyPeriod=w;
        }
 

public void displayFullDetails(){
    displayProduct();
    System.out.println("warrantyPeriod:"+warrantyPeriod);
}
}


public class Main4 {
    public static void main(String[] args) {
        Electronics e1=new Electronics("Laptop", 50000, 2);
        e1.displayFullDetails();
    }
}

