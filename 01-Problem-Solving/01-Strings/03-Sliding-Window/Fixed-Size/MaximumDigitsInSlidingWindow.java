/*
Problem Statement
Given a string containing letters and digits, find the maximum number of digits present in any substring of length K.

Sample Input
String: ab12c345d
K: 4

Sample Output
3

Explanation
ab12 -> 2 digits
b12c -> 2 digits
12c3 -> 3 digits
2c34 -> 3 digits
c345 -> 3 digits
345d -> 3 digits

Maximum = 3
*/

import java.util.Scanner;
public class MaximumDigitsInSlidingWindow{
    static boolean isDigit(char ch){
        return Character.isDigit(ch);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        System.out.print("Enter the Window Size k :");
        int k= sc.nextInt();

        int right=k,left=0,count=0,max=0;
        for(int i=0;i<right;i++){
            if(isDigit(str.charAt(i)))
                count++;
        }
        max=Math.max(max,count);
        while(right<str.length()){
            if(isDigit(str.charAt(left)))
                count--;
            if(isDigit(str.charAt(right)))
                count++;
            max=Math.max(count,max);
            left++;
            right++;
        }
        System.out.println("Maximum number of digits for given window size: "+max);
    }
}