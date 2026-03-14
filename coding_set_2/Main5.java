/*Create a class Student that stores marks of 5 subjects in an array. Use a constructor to initialize the array and write a method to calculate the average marks. */
class Student {
    int[] marks;

Student(int[] m) {
        marks = m;
    }

void calculateAverage() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        double average = (double) sum / marks.length;
        System.out.println("Average Marks: " + average);
    }
    
}

public class Main5{
    public static void main(String[] args) {
        int[]m={10,20,30,40,50};
        Student s=new Student(m);
        s.calculateAverage();
    }
}