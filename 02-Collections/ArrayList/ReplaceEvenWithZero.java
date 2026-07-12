
import java.util.*;
public class ReplaceEvenWithZero {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(15, 25, 10, 40, 25, 60, 80, 10, 95, 100));
        ListIterator<Integer> l = list.listIterator();
        while(l.hasNext()){
            int val=l.next();
            if(val%2==0)
                l.set(0);
        }
        System.out.println(list);

    }
}
