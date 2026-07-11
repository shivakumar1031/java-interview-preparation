/*
    Sample Input:
                hello
    Sample Output:
                holle
*/



import java.util.Scanner;
public class ReverseOnlyVowels {
    public  static boolean isVowel(char ch){
        char cha = Character.toLowerCase(ch);
        if(cha=='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u')
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        int left=0,right=str.length()-1;
        while(left<right){
            if(!isVowel(arr[right])){
                right--;
            }
            if(!isVowel(arr[left])){
                left++;
            }
            if(isVowel(arr[right])&& isVowel(arr[left])){
                char temp = arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                right--;
                left++;
            }
        }
        System.out.println(new String(arr));
    }
}
