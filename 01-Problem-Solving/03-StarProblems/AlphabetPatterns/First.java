/*
A
A B
A B C
A B C D
A B C D E
*/


import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }
}
