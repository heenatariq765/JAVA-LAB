public class Main7 {
    static void checkAge(int age) {
        if(age<18){
            throw new ArithmeticException("not eligible");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}