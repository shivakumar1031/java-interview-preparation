/*
Problem Statement

Given a string and an integer K (window size), find and print the first substring of length K that contains exactly 2 vowels.

If no such substring exists, print:
No such substring found

A vowel is one of:
a, e, i, o, u

Constraints
1 <= String length <= 10^5
1 <= K <= String length

String contains only English alphabets.

Sample Input 1
String: abciiidef
K: 3

Sample Output 1
cii

Explanation
abc -> 1 vowel 
bci -> 1 vowel 
cii -> 2 vowels    First matching substring
iii -> 3 vowels
iid -> 2 vowels
ide -> 2 vowels
*/

import java.util.Scanner;
public class FirstSubstringWithExactlyKVowels {
    static boolean isVowel(char ch){
        char chr = Character.toLowerCase(ch);
        return chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        System.out.println("Enter the size of Window : ");
        int n=sc.nextInt();

        if(n>str.length()){
            System.out.println("Invalid Window Size ");
            return;
        }

        int right=n,left=0,count=0;
        for(int i=0;i<n;i++){
            if(isVowel(str.charAt(i)))
                count++;
        }
        if(count==2){
            System.out.println(str.substring(left, right));
            return;
        }
        while(right<str.length()){
            if(isVowel(str.charAt(left))){
                count--;
            }
            if(isVowel(str.charAt(right)))
                count++;
            
            left++;
            right++;
            if(count==2){
                System.out.println(str.substring(left, right));
                return;
            }
        }
        System.out.println("No such Substring exits");
    }
}
