class person{
  String name;
  int age;

    public person(String n, int a) {
        name=n;
        age=a;
    }
void displayPerson(){
    System.out.println("name:"+name);
    System.out.println("age:"+age);
}
}

class Patient extends person{
 String disease;
 String doctorName;

        public Patient(String n, int a, String d, String doc) {
            super(n, a);
            disease=d;
            doctorName=doc;
        }
 

public void displayFullDetails(){
    displayPerson();
    System.out.println("disease:"+disease);
    System.out.println("doctorname"+doctorName);
}
}


public class Main6 {
    public static void main(String[] args) {
        Patient s1=new Patient("Aman",20,"abc","dr.kriti");
        s1.displayFullDetails();
    }
}
