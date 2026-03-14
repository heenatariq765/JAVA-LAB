import java.util.*;
public class Main2{
    public static void main(String[] args) {
        List<Integer>numbers=new ArrayList<>(Arrays.asList(1,2,3,2,4,2,5));
        numbers.removeIf(n->n==2);
        System.out.println(numbers);
    }
}