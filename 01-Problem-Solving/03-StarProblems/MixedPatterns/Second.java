/*

*
A A
* * *
B B B B

*/

import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the rows :");
        int num=sc.nextInt();
        char ch = 'A';
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                if(i%2==0)
                    System.out.print("* ");
                else{
                    System.out.print(ch+ " ");
                    ch++;
                }
            }
            System.out.println();
        }
    }
}
