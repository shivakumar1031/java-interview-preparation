package butterfly;
/*
Hollow Butterfly

Input
9

Output

*        *
**      **
* *    * *
*  *  *  *
*   **   *
*  *  *  *
* *    * *
**      **
*        *


Logic
-----
1. Start with the Butterfly pattern boundary conditions.
2. Replace '<=' and '>=' with '==' to keep only the boundary stars.
3. Add the first and last column conditions:
       j == 0 || j == num - 1
4. Combine all boundary conditions using the OR (||) operator.
5. Print spaces for all remaining positions.

Key Idea
--------
Treat the Hollow Butterfly as the boundary of two mirrored pyramids.
Keep only the boundary stars and the outermost columns, then print
spaces everywhere else.

*/


import java.util.Scanner;
public class HollowButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(j==num/2-Math.abs(num/2-i)||j==num/2+Math.abs(num/2-i) || j==0 || j==num-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }
}
