/*
Problem Statement
Given a LinkedList of integers, print its first and last element.

Sample Input
10 20 30 40 50

Sample Output
First Element : 10
Last Element  : 50
*/
import java.util.LinkedList;
import java.util.Scanner;
public class PrintFirstAndLastElement {
    public static void main(String args[]){

        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            list.add(sc.nextInt());
        }
        System.out.println("First Element : " +list.getFirst());
        System.out.println("Last Element : " +list.getLast());
    }
}
