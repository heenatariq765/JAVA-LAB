/*Create a class Student with attributes name and marks. Create an array of Student objects and display the details of all students. */
class Student {
    String name;
    int marks;
 Student(String n, int m) {
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
    public class Main8 {
    public static void main(String[] args) {

        Student[] s = new Student[3];
        s[0] = new Student("Ali", 85);
        s[1] = new Student("Sara", 90);
        s[2] = new Student("John", 78);
    for (int i = 0; i < s.length; i++) {
            s[i].display();
        }
    }
}
