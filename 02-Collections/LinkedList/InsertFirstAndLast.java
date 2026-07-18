
/*
Problem Statement:
Insert one element at the beginning and another at the end of the LinkedList.

Sample Input
Initial List:
10 20 30

Insert at Beginning:
5

Insert at End:
40

Sample Output
5 10 20 30 40
*/

import java.util.LinkedList;
import java.util.Arrays;
public class InsertFirstAndLast {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>(Arrays.asList(10,20,30));
        list.addFirst(5);
        list.addLast(40);
        System.out.println(list);
    }
}
