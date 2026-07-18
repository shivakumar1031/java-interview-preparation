
/*
Count Substrings with Exactly K Vowels

Problem Statement:
Given a string and an integer k (window size), count how many substrings of size k contain exactly 2 vowels.

Constraints
1 <= String length <= 10^5
1 <= k <= String length
String contains only lowercase English letters.

Sample Input:
    String: abciiidef
    k = 3

Sample Output:
    3


Explanation
abc -> 1 vowel ❌
bci -> 1 vowel ❌
cii -> 2 vowels ✅
iii -> 3 vowels ❌
iid -> 2 vowels ✅
ide -> 2 vowels ✅
def -> 1 vowel ❌
*/


import java.util.*;
public class MaximumVowelsInSlidingWindow {
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
        int right=n,left=0,count=0,max=0;
        if(right<str.length()){
            return;
        }
        for(int i=0;i<right;i++){
                if(isVowel(str.charAt(i)))
                    count++;
        }
        max=count;
        System.out.println(str.substring(left,right)+ " --> "+count);

        while(right<=str.length()-1){
            if(isVowel(str.charAt(left)))
                count--;
            if(isVowel(str.charAt(right)))
                count++;
            max=Math.max(max,count);
            right++;
            left++;
            System.out.println(str.substring(left,right)+ " --> "+count);
        }
        System.out.println("Maximum Vowels In Sliding Window is : "+max);
        

    }
}
