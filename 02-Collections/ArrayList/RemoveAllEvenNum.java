import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveAllEvenNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(15, 25, 10, 40, 25, 60, 80, 10, 95, 100));
        Iterator<Integer> l = list.iterator();
        while(l.hasNext()){
            int val=l.next();
            if(val%2==0)
                l.remove();
        }
        System.out.println(list);

    }
}
