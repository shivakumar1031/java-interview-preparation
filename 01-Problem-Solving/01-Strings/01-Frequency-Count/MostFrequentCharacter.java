import java.util.Scanner;
public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int count[] = new int[26];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        // char ch = ' ';
        // for(int i=0;i<str.length()-1;i++){
        //     for(int j=i+1;j<str.length();j++){
        //         if(count[str.charAt(j)-'a']>count[str.charAt(i)-'a']){
        //             ch=str.charAt(j);
        //         }
        //     }
        // }
        
        int max=count[str.charAt(0)-'a'];
        char ch=' ';
        for(int i=0;i<str.length();i++){
            if(max<count[str.charAt(i)-'a']){
                max=count[str.charAt(i)-'a'];
                ch=str.charAt(i);
            }
        }
        System.out.print(ch);
    }
}
