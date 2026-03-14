import java.util.*;
public class Main6 {
    public static void main(String[] args) {
        List<String>list=Arrays.asList("java","is","programming","language");
        System.out.println("original:"+ " " + list);
        Collections.reverse(list);
        System.out.println("after reversing:" + " "+ list);
    }
}
