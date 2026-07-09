import java.util.Scanner;
public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String str1=sc.nextLine();
        System.out.println("Enter second String: ");
        String str2=sc.nextLine();
        
        int count[] = new int[26];
        boolean b=true;
        for(int i=0;i<str1.length();i++){
           char ch = str1.charAt(i);
           count[ch-'a']++;
        }
        for(int i=0;i<str2.length();i++){
           char ch = str2.charAt(i);
           count[ch-'a']--;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>=1)
                b=false;
        }
        System.out.println(b);
    }
}
