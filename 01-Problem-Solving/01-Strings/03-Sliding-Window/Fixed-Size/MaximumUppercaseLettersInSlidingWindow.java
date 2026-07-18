/*
Problem Statement
Given a string containing uppercase and lowercase letters, find the maximum number of uppercase letters present in any substring of length K.

Sample Input
String: AbCdEFghI
K: 4

Sample Output
3

Explanation
AbCd -> 2 uppercase
bCdE -> 2 uppercase
CdEF -> 3 uppercase
dEFg -> 2 uppercase
EFgh -> 2 uppercase
FghI -> 2 uppercase

Maximum = 3
*/


import java.util.Scanner;
public class MaximumUppercaseLettersInSlidingWindow {
    
    static boolean isUpperCase(char ch){
        return Character.isUpperCase(ch);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        System.out.print("Enter the Window Size k :");
        int k= sc.nextInt();

        int right=k,left=0,count=0,max=0;
        for(int i=0;i<right;i++){
            if(isUpperCase(str.charAt(i)))
                count++;
        }
        max=Math.max(max,count);
        while(right<str.length()){
            if(isUpperCase(str.charAt(left)))
                count--;
            if(isUpperCase(str.charAt(right)))
                count++;
            max=Math.max(count,max);
            left++;
            right++;
        }
        System.out.println("Maximum number of Upper case in k size window: "+max);
    
    }
}
