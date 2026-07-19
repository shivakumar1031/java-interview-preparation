/*
A
B C
D E F
G H I J
*/

import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int num = sc.nextInt();
        int ch='A';
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)((ch)++)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
