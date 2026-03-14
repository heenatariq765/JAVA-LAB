/*Create a class Sentence that stores a sentence (String). Write a method that splits the sentence into words and counts the total number of words. */
public class Main10{
    public static void main(String[] args) {
        Sentence s= new Sentence("Java is a programming language.");
        s.countWords();
    }
}
class Sentence{
    String text;
Sentence(String t){
        text=t;
    }
void countWords(){
        String[] words=text.split(" ");
        int count=words.length;
        System.out.println("original sentence :" + " "+ text);
        System.out.println("Total word count :" + " " + count);
    }  
}
