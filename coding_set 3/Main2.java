class employee{
  protected String name;
  protected  double baseSalary;

    public employee(String n, double bs) {
        name=n;
        baseSalary=bs;
    }
void displayEmployee(){
    System.out.println("name:"+name);
    System.out.println("baseSalary:"+baseSalary);
}
}

class Manager extends employee{
    double bonus;
    double total;

        public Manager(String n, double bs, double b, double t) {
            super(n, bs);
            bonus=b;
            total=t;
        }
  
 public double calculateTotal(double total){
    return baseSalary+ bonus;
 }


public void displayFullDetails(){
    displayEmployee();
    System.out.println("bonus:"+bonus);
    System.out.println("total:" + total);
}
}




public class Main2{
     public static void main(String[] args) {
       Manager m1= new  Manager("Aman",12000,5000,17000);
        m1.displayFullDetails();
    }
}

