/*Create a class Student with data members name and rollNo. Use a constructor to initialize them  and display the student details. */
class Student{
    String name;
    int rollNo;

Student(String n,int r){
  name=n;
  rollNo=r;
}
 void display(){
    System.out.println("Name :" + " "+ name);
    System.out.println("Roll No:" + " " + rollNo);
 }
}

public class Main1{
    public static void main(String[] args) {
        Student s= new Student("Sneha",10);
        s.display();
    }
}

 

