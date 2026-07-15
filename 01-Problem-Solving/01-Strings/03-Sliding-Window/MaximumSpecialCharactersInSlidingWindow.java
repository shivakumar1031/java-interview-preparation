/*
Problem Statement
Given a string containing letters, digits and special characters, find the maximum number of special characters present in any substring of length K.

A special character is any character that is not a letter and not a digit.

Sample Input
String: ab@#12$c!
K: 4

Sample Output
2

Explanation
ab@# -> 2 special
b@#1 -> 2 special
@#12 -> 2 special
#12$ -> 2 special
12$c -> 1 special
2$c! -> 2 special

Maximum = 2
*/



import java.util.Scanner;
public class MaximumSpecialCharactersInSlidingWindow {
    
    static boolean isSpecialSymbol(char ch){
        return !Character.isDigit(ch)&&!Character.isLetter(ch);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        System.out.print("Enter the Window Size k :");
        int k= sc.nextInt();

        int right=k,left=0,count=0,max=0;
        for(int i=0;i<right;i++){
            if(isSpecialSymbol(str.charAt(i)))
                count++;
        }
        max=Math.max(max,count);
        while(right<str.length()){
            if(isSpecialSymbol(str.charAt(left)))
                count--;
            if(isSpecialSymbol(str.charAt(right)))
                count++;
            max=Math.max(count,max);
            left++;
            right++;
        }
        System.out.println("Maximum number of Special Character in given Window: "+max);
    }
}
