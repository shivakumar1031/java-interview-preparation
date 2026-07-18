
/*
    Write a Program to remove the duplicate characters in given String ?

    Input:
    Enter String: 
    programming

    Ouput:
    progamin
*/

import java.util.Scanner;
/* 
| Requirement              | Data Structure                        |
| ------------------------ | ------------------------------------- |
| Count occurrences        | int[] count = new int[26]`           |
| Seen / Not Seen          | boolean[] visited = new boolean[26]` |
| Preserve insertion order | Traverse the original string          |
| Alphabetical order       | Traverse the `count[]` array          |*/

public class RemoveDuplicateCharacters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine().toLowerCase();
        
        boolean b[] = new boolean[26];
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(b[ch-'a']==false){
                sb.append(ch);
                b[ch-'a']=true;
            }
        }
        System.out.println(sb);

    }
}
