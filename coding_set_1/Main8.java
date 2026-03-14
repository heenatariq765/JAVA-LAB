import java.util.*;
public class Main8 {
    public static void main(String[] args) {
        List<String>words=Arrays.asList("apple","banana","apple","orange","banana","apple");
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:words){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
        }
        System.out.println("Word Count:");
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}

