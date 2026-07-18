/*
    Sort the given string and print it in ascending order or alphabatic order?
    Input:
        Enter the String : shiva
    Ouput:
        ahisv
*/

import java.util.Scanner;
public class StringSorting{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine().toLowerCase();
        int count[] = new int[26] ;
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                System.out.print((char)(i+'a'));
                count[i]--;
            }
        }
    }
}