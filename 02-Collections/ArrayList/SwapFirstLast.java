
import java.util.*;
public class SwapFirstLast {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(15, 25, 10, 40, 25, 60, 80, 10, 95, 100));
        Iterator<Integer> l = list.iterator();
        int temp=list.get(list.size()-1);
        list.set(list.size()-1,list.get(0));
        list.set(0,temp);
        System.out.println(list);

    }
}
