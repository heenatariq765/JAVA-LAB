class person{
  protected String name;
  protected  int age;

    public person(String n, int a) {
        name=n;
        age=a;
    }
void displayPerson(){
    System.out.println("name:"+name);
    System.out.println("age:"+age);
}
}

class Student extends person{
   int rollNo;
   String course;

        public Student(String n, int a, int r, String c) {
            super(n, a);
            rollNo=r;
            course=c;
        }
 

public void displayFullDetails(){
    displayPerson();
    System.out.println("rollNo:"+rollNo);
    System.out.println("course:"+course);
}
}


public class Main1 {
    public static void main(String[] args) {
        Student s1=new Student("Aman",20,101,"Computer Science");
        s1.displayFullDetails();
    }
}
