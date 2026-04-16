class Main1{
    public static void main(String[] args) {
        int a=2, b=0;
        try {
            int result =a/b;
        System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("divide by zero exception");
        }
    }
}