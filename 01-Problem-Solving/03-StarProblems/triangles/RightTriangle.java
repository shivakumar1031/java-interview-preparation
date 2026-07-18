/*
Right Triangle

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
1. Observe the last star position in each row.
2. The row index (i) determines the number of stars.
3. Print '*' from the first column to the boundary (j <= i).

Key Idea
--------
Derive the star boundary using the row index (i). Print stars up to
that boundary, with no leading spaces.
*/

import java.util.Scanner;
public class RightTriangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){     
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
