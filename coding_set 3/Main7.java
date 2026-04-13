class student{
   String name;
  int marks;

    public student(String n, int m) {
        name=n;
        marks=m;
    }
void displayStudent(){
    System.out.println("name:"+name);
    System.out.println("marks:"+marks);
}
}

class Result extends student{
   String grade;

        public Result(String n, int m, String g) {
            super(n, m);
            grade=g;
        }
 void grade(){
    if(marks>80){
        System.out.println("A");
    }
    else if(marks>50){
        System.out.println("B");
    }
    else{
        System.out.println("C");
    }
 }

public void displayFullDetails(){
    displayStudent();
    System.out.println("grade"+grade);
}
}


public class Main7 {
    public static void main(String[] args) {
        Result s1=new Result("Aman",85,"A");
        s1.displayFullDetails();
        System.out.print("grade:");
        s1.grade();
    }
}
