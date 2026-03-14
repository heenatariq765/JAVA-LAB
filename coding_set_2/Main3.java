/* Create a class Employee with attributes name, designation, and salary. Initialize them using a constructor and display the employee information.*/
class Employee {
    String name;
    String designation;
    double salary;
Employee(String n,String d,double s){
  name=n;
  designation=d;
  salary=s;
}
 void display(){
    System.out.println("Name :" + " "+ name);
    System.out.println("Designation :" + " "+ designation);
    System.out.println("Salary :"+ " "+ salary);
 }
}

public class Main3{
    public static void main(String[] args) {
        Employee s= new Employee("Sneha","HR",50000);
        s.display();
    }
}