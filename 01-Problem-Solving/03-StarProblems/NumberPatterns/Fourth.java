/*
1
2 1
3 2 1
4 3 2 1
*/

import java.util.Scanner;
public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int num = sc.nextInt(),count=0;
        for(int i=1;i<=num;i++){
            count=i;
            for(int j=1;j<=i;j++){
                System.out.print(count-- + " ");
            }
            System.out.println();
        }
    }
}
