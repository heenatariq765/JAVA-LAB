import java.util.*;
public class Main7 {
    public static void main(String[] args) {
        List<Integer>numbers=Arrays.asList(2,5,4,7,9,8,1);
        Collections.sort(numbers);
        System.out.println("Ascending order:" +" "+ numbers);
        Collections.reverse(numbers);
        System.out.println("Descending order:" +" "+ numbers);
    }
}
