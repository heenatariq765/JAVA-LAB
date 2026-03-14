import java.util.*;
public class Main4 {
    public static void main(String[] args) {
        Integer[]array={1,2,3,4,5};
    //array to list
        List<Integer>list=Arrays.asList(array);
        System.out.println(list);
    //list to array    
        Integer[]Arr=list.toArray(new Integer[0]);
        System.out.println("Array elements:");
       for(int j:Arr){
        System.out.println(j);
       }

    }
}
