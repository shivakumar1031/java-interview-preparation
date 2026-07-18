package diamonds;
/*
Hollow Diamond

Input
9

Output

    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *


Logic
-----

1. Find the leading spaces using:
       spaces = Math.abs(mid - i)

2. Print spaces until the first boundary.
3. Print '*' at the first boundary.
4. Find the last boundary:
       lastBoundary = num - 1 - spaces
5. Print '*' at both boundaries:
       j == spaces || j == lastBoundary
6. Print spaces for all remaining positions.

Key Idea
--------
Find the space condition first, then determine the left and right
star boundaries. Print stars only at those boundaries and spaces
everywhere else.

*/

import java.util.Scanner;
public class HollowDiamond {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num=sc.nextInt();
        
        for(int i=0;i<num;i++){
            int replace=Math.abs(num/2-i);
            for(int j=0;j<=num-1-replace;j++){
                if(j<replace)
                    System.out.print("  ");
                else if(j==replace||j==num-1-replace)
                    System.out.print("* ");
                else
                    System.out.print("  ");


            }
            System.out.println();
        }
    }
}
