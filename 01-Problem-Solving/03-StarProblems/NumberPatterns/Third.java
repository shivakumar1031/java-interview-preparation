/*
1
2 3
4 5 6
7 8 9 10
*/
import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(++count +" ");
            }
            System.out.println();
        }
    }
}
