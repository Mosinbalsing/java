import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Listitrator {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();  
        fruits.add("Apple");  
        fruits.add("Banana");  
        fruits.add("Orange");  
        ListIterator<String> listIterator = fruits.listIterator();  
        while (listIterator.hasNext()) {  
            String fruit = listIterator.next();  
            System.out.println(fruit);      
        }  
        while (listIterator.hasPrevious()) {  
            String fruit = listIterator.previous();  
            System.out.println(fruit);
        }  

}
}
