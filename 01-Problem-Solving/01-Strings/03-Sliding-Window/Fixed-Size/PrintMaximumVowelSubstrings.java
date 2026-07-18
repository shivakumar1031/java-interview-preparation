/*
Print All Substrings of Size K Having Maximum Vowels

Problem Statement:
Given a string and an integer k, print all substrings of size k that have the maximum number of vowels.

Constraints
1 <= String length <= 10^5
1 <= k <= String length

Sample Input
    String: abciiidef
    k = 3

Sample Output
    iii
*/
import java.util.Scanner;
public class PrintMaximumVowelSubstrings {
    static boolean isVowel(char ch){
        char chr = Character.toUpperCase(ch);
        return chr=='A' || chr=='E'||chr=='I'||chr=='O'||chr=='U';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println("Enter the Window Size: ");
        int n = sc.nextInt();

        if(n>str.length()){
            System.out.println("Invalid inputs");
            return;
        }

        int right =n,left=0,max=0,count=0; 
        for(int i=0;i<n;i++){
            if(isVowel(str.charAt(i)))
                count++;
        }
        max=count;
        while(right<=str.length()-1){
            if(isVowel(str.charAt(left)))
                count--;
            if(isVowel(str.charAt(right)))
                count++;
            max=Math.max(max,count);
            left++;
            right++;
        }
       right =n;
       left=0;
       count=0; 
        for(int i=0;i<n;i++){
            if(isVowel(str.charAt(i)))
                count++;
        }
        if(count==max)
            System.out.println(str.substring(left, right)+"--> "+max);
        while(right<=str.length()-1){
            if(isVowel(str.charAt(left)))
                count--;
            if(isVowel(str.charAt(right)))
                count++;
            
            left++;
            right++;
            if(count==max)
                System.out.println(str.substring(left, right)+"--> "+max);
        }
    }
}
