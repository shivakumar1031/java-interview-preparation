import java.util.*;
public class FindMaxMinWithCollec {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(15, 25, 10, 40, 25, 60, 80, 10, 95, 100));
        System.out.println("Max : "+Collections.max(list));
        System.out.println("Min : " +Collections.min(list));

    }
}
