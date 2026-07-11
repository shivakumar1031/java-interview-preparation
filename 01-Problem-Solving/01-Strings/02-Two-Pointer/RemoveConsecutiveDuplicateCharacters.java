/*
Remove Consecutive Duplicate Characters

Problem Statement:
Given a string, remove consecutive duplicate characters while keeping only one occurrence of each consecutive group.

Constraints
1 <= length <= 10^5
String contains lowercase English letters.

Sample Input:
aaabbbccdaa
Sample Output:
abcda


Explanation
aaa -> a
bbb -> b
cc -> c
d -> d
aa -> a
*/

import java.util.Scanner;
public class RemoveConsecutiveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);


    }
}
