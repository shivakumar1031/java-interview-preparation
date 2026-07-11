/*
Reverse Every Word

Problem Statement:
Given a sentence, reverse each word individually while keeping the order of words unchanged.

Constraints
1 <= length <= 10^5
Words are separated by one space.

Sample Input 
Java is fun

Sample Output 
avaJ si nuf

Explanation
Java -> avaJ

is -> si

fun -> nuf
*/

import java.util.Scanner;
public class ReverseEveryWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String arr[] = str.split(" ");
        for(int i=0;i<arr.length;i++){
            arr[i]= new StringBuilder(arr[i]).reverse().toString();
        }
        System.out.println(String.join(" ",arr));
    }
}
