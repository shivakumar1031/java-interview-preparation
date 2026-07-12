import java.util.*;
public class CountFrequencyEachElement {
    public static void main(String args[]){
        List<Integer> list=new ArrayList<>(List.of(15,25 ,10, 40, 25, 60, 80, 10, 95, 100));
        ArrayList<Integer> verify=new ArrayList<>();
        for(int i : list){
            if(verify.contains(i)){
                continue;
            }
            int count=0;
            for(int j=0;j<list.size();j++){
                if(i==list.get(j))
                    count++;
            }
            System.out.println(i +" --> "+ count);
        }
    }
}

