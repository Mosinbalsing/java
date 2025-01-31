import java.util.ArrayList;
import java.util.Iterator;

public class removedemo {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        System.out.println(arr);
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            int i = it.next();
            System.out.println(i);
            if (i % 2 == 0) {
                it.remove();
            }
        }
        System.out.println(arr);
    }
}