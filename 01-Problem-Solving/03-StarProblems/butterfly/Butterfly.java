package butterfly;
/*
Butterfly

Input
9

Output

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *


Logic
-----
1. Observe the left pyramid boundary and derive its condition.
2. Observe the right pyramid boundary and derive its condition.
3. Combine both boundary conditions using the OR (||) operator.
4. Print '*' whenever either boundary condition is satisfied.
5. Print spaces for all remaining positions.

Key Idea
--------
Treat the Butterfly pattern as two mirrored pyramids.
Find the boundaries of both pyramids separately, derive their
formulas by comparing the row index (i) with the column index (j),
then combine the conditions to print the final pattern.

*/
import java.util.Scanner;
public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(j<=num/2-Math.abs(num/2-i) || j>=num/2+Math.abs(num/2-i))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
