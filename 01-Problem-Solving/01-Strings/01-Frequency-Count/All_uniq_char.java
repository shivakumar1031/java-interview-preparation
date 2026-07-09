import java.util.Scanner;
public class All_uniq_char {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine().toLowerCase();
        int[] count = new int[26];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        boolean ch =true;
        for(int i = 0;i<str.length();i++){
            if(count[str.charAt(i)-'a']>1){
                ch=false;
                break;
            }
        }
    
        System.out.println(ch);
        
    }
}
