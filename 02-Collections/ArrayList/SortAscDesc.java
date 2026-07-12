import java.util.*;

public class SortAscDesc {
    static ArrayList<Integer> list;
    
    public static void swap(int i,int j){
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
    public static void main(String[] args) {
        list = new ArrayList<>(Arrays.asList(15, 25, 10, 40, 25, 60, 80, 10, 95, 100));
        // for(int i=0;i<list.size()-1;i++){
        //     for(int j=i+1;j<list.size();j++){
        //         if(list.get(i)>list.get(j))
        //             swap(i,j);
        //     }
        // }
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)<list.get(j))
                    swap(i,j);
            }
        }
        System.out.println(list);

    }
}
