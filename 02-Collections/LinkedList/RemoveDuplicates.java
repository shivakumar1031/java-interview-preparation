/*
Problem Statement
Remove duplicate elements while keeping the first occurrence.

Sample Input
10 20 30 20 10 40 50 40

Sample Output
10 20 30 40 50
*/

import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of(10,20,30,20,10,40,50,40));
        Iterator<Integer> li  = list.iterator();
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)==list.get(j)){
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list);
    }
}
