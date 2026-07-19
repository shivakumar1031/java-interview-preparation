/* 
1
A B
1 2 3
A B C D
*/


import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int num=sc.nextInt();
        
        for(int i=1;i<=num;i++){
            char ch = 'A';
            for(int j=1;j<=i;j++){
                if(i%2==0)
                    System.out.print(ch++ +" ");
                else
                    System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
