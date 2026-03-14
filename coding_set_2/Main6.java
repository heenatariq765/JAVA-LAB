/*Create a class Car with attributes brand and price. Use the this keyword inside the constructor to initialize the variables and display the details. */
class Car {
    String brand;
    double price;
    
    Car(String b, double p) {
        brand = b;
        price = p;
    }
    
    void display() {
        System.out.println("Brand: " + brand + ", Price: $" + price);
    }
}
public class Main6 {
    public static void main(String[] args) {
        Car c = new Car("Toyota", 2500000);
        c.display();
    }
}
