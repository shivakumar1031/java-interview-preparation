package pyramids;
/*
Hollow Pyramid

Input
5

Output

        *
      *   *
    *       *
  *           *
* * * * * * * * *
*/

/*
Logic:

1. Print stars only on the left boundary.
2. Print stars only on the right boundary.
3. Print stars on the last row.
4. Print spaces everywhere else.

Boundary Conditions:

Left  : i + j == num - 1
Right : j - i == num - 1
Base  : i == num - 1
*/

import java.util.Scanner;
public class HollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num+i;j++){
                if((i+j==num-1 || j-i==num-1)&& i<num-1 )
                    System.out.print(" * ");
                else if(i==num-1)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
