/* Create a class Message that stores a string. Write methods to display the length of the string and its uppercase form.*/
class Message {
    String text;
    
Message(String t) {
        text = t;
    }
    
void display() {
        System.out.println("original text: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
    }
}
public class Main7 {
    public static void main(String[] args) {
        Message m = new Message("hello world");
        m.display();
    }
}