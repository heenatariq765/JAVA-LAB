class book{
  protected String title;
  protected  String author;

    public book(String t, String a) {
        title=t;
        author=a;
    }
void displayBook(){
    System.out.println("title:"+title);
    System.out.println("author:"+author);
}
}

class IssuedBook extends book{
   int issueDate;
   int returnDate;

        public IssuedBook(String t, String a, int i, int r) {
            super(t, a);
            issueDate=i;
            returnDate=r;
        }
 

public void displayFullDetails(){
    displayBook();
    System.out.println("issueDate:"+issueDate);
    System.out.println("returnDate:"+returnDate);
}
}


public class Main9 {
    public static void main(String[] args) {
        IssuedBook i1=new IssuedBook("learning how to fly","APJ Abdul Kalam",1,15);
        i1.displayFullDetails();
    }
}

