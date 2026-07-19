/*
A
B B
C C C
D D D D
E E E E E
*/

import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows :");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)('A'+i)+" ");
            }
            System.out.println();
        }

    }
}
