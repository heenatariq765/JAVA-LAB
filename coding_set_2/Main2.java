/*Rectangle Area Create a class Rectangle with length and width.Use a parameterized constructor to initialize the values and write a method to calculate and display the area. */
class Rectangle{
    double length;
    double width;

Rectangle(double l, double w){
  length=l;
  width=w;
}
 void calculateArea(){
    double area=length*width;
    System.out.println("Area :" + " "+area);
 }
}

public class Main2{
    public static void main(String[] args) {
         Rectangle r= new Rectangle(1.2, 1.4);
         r.calculateArea();
    }
}
