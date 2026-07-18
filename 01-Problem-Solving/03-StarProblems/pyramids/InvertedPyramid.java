package pyramids;
/*
Inverted Pyramid

Input
5

Output

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * * 
        *

Logic
-----
1. Observe the leading-space boundary in each row.
2. The row index (i) determines how the boundary shifts right.
3. Print spaces before the boundary (j < i).
4. Print '*' from the boundary to the last required column.

Key Idea
--------
Start by deriving the leading-space boundary. Once the boundary is
known, extend the loop only up to the last required column, allowing
the number of stars to decrease automatically in each row.
*/


import java.util.Scanner;
public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<2*num-1-i;j++){
                if(j<i)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
