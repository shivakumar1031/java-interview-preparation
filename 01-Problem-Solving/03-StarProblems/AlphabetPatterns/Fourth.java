/*
A B C D E
A B C D
A B C
A B
A
*/
import java.util.Scanner;
public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int num= sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }
}
