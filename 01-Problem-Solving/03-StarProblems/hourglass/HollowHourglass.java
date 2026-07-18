package hourglass;
/*
Hollow Hourglass

Input
-----
9

Output
------
* * * * * * * * *
  *           *
    *       *
      *   *
        *
      *   *
    *       *
  *           *
* * * * * * * * *

Logic
-----
1. Find the left and right star boundaries for each row.
2. Print '*' only at the two boundaries.
3. Print '*' for the first and last rows.
4. Print spaces for all remaining positions.

Key Idea
--------
Use the same boundary-based approach as the Hourglass pattern.
First derive the left and right star boundaries, then modify the
condition to print stars only on those boundaries. The first and
last rows are printed completely with stars.
*/

import java.util.Scanner;

public class HollowHourglass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<=num/2+Math.abs(num/2-i);j++){
                if((j==num/2-Math.abs(num/2-i))|| j==num/2+Math.abs(num/2-i))
                    System.out.print("* ");
                else if(i==0||i==num-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }
}
