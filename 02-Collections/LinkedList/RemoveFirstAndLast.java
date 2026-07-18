/*
Problem Statement
Remove the first and last element from the LinkedList.

Sample Input
10 20 30 40 50

Sample Output
20 30 40
*/

import java.util.LinkedList;
import java.util.Arrays;
public class RemoveFirstAndLast {
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10,20,30,40,50));
        System.out.println(list);
        System.out.println(list.remove());
        System.out.println(list.removeLast());
        System.out.println(list);
    }
}
