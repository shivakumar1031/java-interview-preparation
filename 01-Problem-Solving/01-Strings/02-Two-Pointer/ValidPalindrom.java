/*  Sample Input:
        Enter String : 
        j a v a a v a j
    Sample Output:
        Palindrome
 */

        
import java.util.Scanner;
public class ValidPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        int right=str.length()-1,left=0;
        boolean b= true;
        while(right>left){
            if(str.charAt(left) == ' '){
                left++;
            }
            else if( str.charAt(right)==' '){
                right--;
            }
            else if(str.charAt(left)!=str.charAt(right)){
                b=false;
                break;
            }
            right--;
            left++;
            
        }
        if(b)
                System.out.println("Palindrome");
            else
                System.out.print("Not Palindrome");
    }
}
