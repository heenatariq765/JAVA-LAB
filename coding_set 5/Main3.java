class Main3 {
    public static void main(String[] args) {
        String str = "hello";
        try {
            int num= Integer.parseInt(str);
            System.out.println("parsed num "+ num);
        } catch (NumberFormatException e) {
            System.out.println("error....unable to find integer");
        }
    }
}