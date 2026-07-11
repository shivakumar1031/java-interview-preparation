/*
Sample Input:
    Enter the String: 
    shiva
Sample Output:
    Not a Palindrome
*/

import java.util.Scanner;

public class CheckPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        int right = str.length()-1,left=0;
        boolean b = true;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                b=false;
                break;
            }
            right--;
            left++;
        }
        if(b)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
