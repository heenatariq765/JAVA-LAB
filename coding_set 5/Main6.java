class Main6{
    public static void main(String[] args) {
       try {
           int x=10/0;
       } catch (Exception e) {
           System.out.println("exception occured");
       }
       finally{
        System.out.println("finally...always executes");
       }
    }
}