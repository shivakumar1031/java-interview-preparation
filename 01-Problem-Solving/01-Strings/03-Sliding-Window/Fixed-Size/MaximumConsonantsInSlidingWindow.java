/*
Problem Statement

Given a string and an integer K, find the maximum number of consonants present in any substring of length K.

Sample Input
String: abciiidef
K: 3

Sample Output
3

Explanation
abc -> 2 consonants
bci -> 2 consonants
cii -> 1 consonant
iii -> 0 consonants
iid -> 1 consonant
ide -> 1 consonant
def -> 3 consonants

Maximum = 3
*/

import java.util.Scanner;


public class MaximumConsonantsInSlidingWindow {
    public static boolean isVowel(char ch){
        char chr=Character.toLowerCase(ch);
        return chr=='a'||chr=='e'|| chr=='i'||chr=='o'||chr=='u';
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        System.out.print("Enter the Window Size k :");
        int k= sc.nextInt();

        int right=k,left=0,count=0,max=0;
        for(int i=0;i<right;i++){
            if(!isVowel(str.charAt(i)))
                count++;
        }
        max=Math.max(max,count);
        while(right<str.length()){
            if(!isVowel(str.charAt(left)))
                count--;
            if(!isVowel(str.charAt(right)))
                count++;
            max=Math.max(count,max);
            left++;
            right++;
        }
        System.out.println("Maximum number of consonants for given window size: "+max);
    }
}
