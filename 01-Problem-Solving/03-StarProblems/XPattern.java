/*
X Pattern

Input
5

Output

*   *
 * *
  *
 * *
*   *


Logic
-----
1. Identify the two diagonals of the pattern.
2. Print '*' when the current position lies on either diagonal:
       i == j
       i + j == num - 1
3. Restrict the j-loop to the last required star position to avoid
   unnecessary iterations.
4. Print spaces for all remaining positions.

Key Idea
--------
The X Pattern is formed by two intersecting diagonals. Derive the
conditions for both diagonals, combine them using the OR (||) operator,
and print spaces elsewhere.
*/


import java.util.Scanner;
public class XPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<=num/2+Math.abs(num/2-i);j++){
                if(i==j || i+j==num-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();

        }
    }
}
