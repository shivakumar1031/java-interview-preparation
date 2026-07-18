/*
Reverse Right Triangle

Input
5

Output

* * * * *
* * * *
* * *
* *
*

Logic
-----
1. Observe the last star position in each row.
2. The number of stars decreases as the row index (i) increases.
3. Print '*' from the first column to the boundary (j < num - i).

Key Idea
--------
Derive the star boundary using the row index (i). As the boundary
moves left in each row, the number of stars decreases accordingly.
*/

import java.util.Scanner;
public class ReverseRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){    
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
