/*
Sample Input :

Enter the number: 
                6

Sample Output:
            * * * * * * 
            * * * * * 
            * * * * 
            * * * 
            * * 
            *
*/



import java.util.Scanner;
public class Triangle02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        for(int i=0;i<number;i++){
            for(int j=i;j<number;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
