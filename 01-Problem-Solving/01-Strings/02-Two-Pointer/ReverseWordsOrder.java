/*
Reverse Words Order

Input
Java is fun

Output
fun is Java
*/

import java.util.Scanner;
public class ReverseWordsOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String arr[] = str.split(" ");
        int right=arr.length-1,left=0;
        while(right>left){
            String temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println(String.join(" ",arr));
    }
}
