/*
Problem: Count Substrings with Exactly Two Vowels

Problem Statement:
Given a string and an integer K (window size), count the number of substrings
of length K that contain exactly two vowels.

A vowel is one of: a, e, i, o, u.

Constraints:
1 <= String length <= 10^5
1 <= K <= String length
String contains only English alphabets.

Sample Input 1:
String: abciiidef
K: 3

Sample Output 1:
3

Explanation:
abc -> 1 vowel ✗
bci -> 1 vowel ✗
cii -> 2 vowels ✓
iii -> 3 vowels ✗
iid -> 2 vowels ✓
ide -> 2 vowels ✓
def -> 1 vowel ✗

Total substrings with exactly 2 vowels = 3
*/


import java.util.*;
public class CountSubstringsWithExactlyKVowels {
    static boolean isVowel(char ch){
        char chr = Character.toLowerCase(ch);
        return chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Enter the Window size: ");
        int n = sc.nextInt();
        int right=n,left=0,count=0,answer=0;
        if(n>str.length()){
            System.out.println("Invalid String or Window Size: ");
            return;
        }

        
        for(int i=0;i<right;i++){
            if(isVowel(str.charAt(i)))
                count++;
        }
        
        if(count==2)
            answer++;

        while(right<=str.length()-1){
            if(isVowel(str.charAt(left)))
                count--;
            if(isVowel(str.charAt(right)))
                count++;
            right++;
            left++;
            if(count==2)
                answer++;
        }
        System.out.println("Maximum Vowels In Sliding Window k where vowels are exactly 2 is : "+(answer));
        

    }
}


