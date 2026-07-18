/*
Problem Statement
Given two strings s and t, determine whether s is a subsequence of t.
A subsequence means all characters of s appear in t in the same order, but not necessarily consecutively.

Constraints
0 <= s.length <= 100
0 <= t.length <= 10^5

Sample Input 
s = abc
t = ahbgdc

Sample Output 
true

Explanation
t = a h b g d c
    ↑   ↑     ↑

The characters a, b, and c appear in order.
*/

import java.util.Scanner;

public class IsSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int slow=0;

        for(int i=0;i<str2.length();i++){
            if(slow<str1.length() && str1.charAt(slow)==str2.charAt(i)){
                slow++;
            }
        }
        System.out.println(slow==str1.length());
        
    }
}
