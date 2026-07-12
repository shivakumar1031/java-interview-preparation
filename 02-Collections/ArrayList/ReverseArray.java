
import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(15, 25, 10, 40, 25, 60, 80, 10, 95, 100));
        int right=list.size()-1,left=0;
        while(right>left){
            int temp=list.get(left);
            int t=list.get(right);
            list.set(left,t);
            list.set(right,temp);
            right--;
            left++;
        }
        System.out.println(list);

    }
}
