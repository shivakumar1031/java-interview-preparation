/*
Left Triangle

Input
5

Output

        *
      * *
    * * *
  * * * *
* * * * *

Logic
-----
1. Observe the starting position of the stars in each row.
2. The row index (i) determines the number of leading spaces.
3. Print spaces before the star boundary (j < num - 1 - i).
4. Print '*' from the boundary to the last column.

Key Idea
--------
Derive the star boundary by observing how it shifts left in each row.
Print spaces before the boundary and stars for the remaining positions.
*/

import java.util.Scanner;
public class LeftTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){    
                //here we need to find boundary for space and stars then build a condition
                if(j<num-1-i)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
