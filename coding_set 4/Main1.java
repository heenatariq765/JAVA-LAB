class Result {
    private int marks; 

    Result(int m) {
        marks = m;
    }
    public int getMarks() {
        return marks;
    }

    void setMarks(int m) {
        marks = m;
    }
}

class Admin {
    void update(Result r, int m) {
     r.setMarks(m);  
    }
}

public class Main1 {
    public static void main(String[] args) {
        Result r = new Result(60);
        System.out.println("Marks: " + r.getMarks());

        Admin a = new Admin();
        a.update(r, 85);
        System.out.println("Updated Marks: " + r.getMarks());
    }
}