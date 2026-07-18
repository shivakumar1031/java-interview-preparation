/*
Reverse Only Alphabets

Problem Statement:
Given a string containing alphabets and special characters, 
reverse only the alphabets while keeping all special characters in their original positions.

Constraints
1 <= length <= 10^5
String may contain:
Uppercase letters
Lowercase letters
Digits
Special characters (@, #, $, %, !, etc.)

Sample Input 1
a,b$c
Sample Output 1
c,b$a


Explanation:
Only alphabets are reversed.

Original : a , b $ c
Letters  : a b c
Reverse Letters : c b a

Output : c,b$a
*/

import java.util.Scanner;
public class ReverseOnlyAlphabets {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        int right=ch.length-1,left=0;
        while(right>left){
            if(!Character.isLetter(ch[left])){
                left++;
            }
            else if(!Character.isLetter(ch[right])){
                right--;
            }
            else{
                char temp = ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }
        System.out.print(new String(ch));
    }
}
