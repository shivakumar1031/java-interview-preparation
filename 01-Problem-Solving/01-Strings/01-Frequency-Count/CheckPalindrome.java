import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean b = true;
        int right = str.length()-1,left=0;
        while(right>=left){
            if(str.charAt(left)!=str.charAt(right))
                b=false;
            right--;
            left++;
        }
        if(b)
            System.out.print("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}
/*
    Input:
    racecat
    
    Ouput:
    Not Palindrome
*/