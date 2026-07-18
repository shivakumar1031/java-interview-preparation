/*
Problem Statement:
Find the middle element of the LinkedList.

If there are two middle elements, print the second one.

Sample Input
10 20 30 40 50

Sample Output
30
*/


import java.util.LinkedList;
import java.util.Arrays;
public class FindMiddleElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10,20,30,40,50));
        System.out.println(list.get(list.size()/2));
    }
}
