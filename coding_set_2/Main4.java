/* Create a class Book with attributes title and price. Implement two constructors: one default constructor and one parameterized constructor. Display the book details.*/
public class Main4{
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("learning how to fly" , 650);
        b1.display();
        b2.display();
    }
}

class Book{
    String title;
    double price;

Book(){
    title="unknown";
    price=0.0;
    }

public Book(String t, double p) {
    title = t;
    price = p;
    }
void display(){
    System.out.println("title :"+ " "+ title +"  " +"price :" + price);
}
}