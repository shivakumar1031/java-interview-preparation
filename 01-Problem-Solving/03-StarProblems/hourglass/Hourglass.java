package hourglass;
/*
Hourglass

Input
9

Output

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

Logic
-----
1. Find the left boundary of the stars.
2. Find the right boundary of the stars.
3. Print '*' between the two boundaries.
4. Print spaces outside the boundaries.

Key Idea
--------
Observe the star boundaries for each row, derive their formulas using
the row index (i), and use those boundaries to print the pattern.
*/

import java.util.Scanner;
public class Hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num=sc.nextInt();
        for(int i =0;i<num;i++){
            for(int j=0;j<=num/2+Math.abs(num/2-i);j++)
            {
                if(j>=num/2-Math.abs(num/2-i))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
