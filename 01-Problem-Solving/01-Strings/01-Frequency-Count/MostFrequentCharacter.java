/*
    Write a program to find the most frequent occured character in a given string?

    Input:
    Enter the String: 
    programming

    Ouput:
    r

*/
import java.util.Scanner;
public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine().toLowerCase();
        int count[] = new int[26];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        
        int max=count[str.charAt(0)-'a'];
        char ch=' ';
        for(int i=0;i<str.length();i++){
            if(max<count[str.charAt(i)-'a']){
                max=count[str.charAt(i)-'a'];
                ch=str.charAt(i);
            }
        }
        System.out.print(ch);
    }
}
