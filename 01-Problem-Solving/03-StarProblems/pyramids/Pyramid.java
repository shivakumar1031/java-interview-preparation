package pyramids;
/*
Pyramid

Input
5

Output

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

Logic
-----
1. Observe the leading-space boundary in each row.
2. The row index (i) determines how the boundary shifts left.
3. Print spaces before the boundary (j < num - 1 - i).
4. Print '*' from the boundary to the last required column.

Key Idea
--------
Start by deriving the leading-space boundary. Once the boundary is
known, print spaces before it and stars after it. As the boundary
moves left in each row, the pyramid expands symmetrically.
*/

import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num+i;j++){  
                if(j<num-1-i)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
