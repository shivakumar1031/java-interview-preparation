/*  Write a Program to find the number of vowels present in a given word?

    Input:
    Enter String: 
    programming

    Ouput:
    Vowel = 3
*/

import java.util.Scanner;
public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine().toLowerCase();

        
        int vowel=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch =='i'||ch=='o'||ch=='u') {
                vowel++;
            }
        }
        System.out.println("Vowel = "+vowel);

    }
}
