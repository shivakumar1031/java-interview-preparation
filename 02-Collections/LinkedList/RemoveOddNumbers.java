/*
Problem Statement:
Remove all odd numbers from the LinkedList.

Sample Input
15 20 25 30 35 40

Sample Output
20 30 40
*/


import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.Arrays;
public class RemoveOddNumbers {
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>(List.of(15,20,25,30,35,40));
        Iterator<Integer> li = list.iterator();
        System.out.println(list);
        
        while(li.hasNext()){
            int i = li.next();
            if(i%2!=0){
                li.remove();
            }
        }                   
        
        System.out.println(list);
    }
}
