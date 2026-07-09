import java.util.Scanner;
public class Most_fre_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int count[] = new int[26];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        int max =0,index=0;
        for(int i=0;i<count.length;i++){
            if(max<count[i]){
                max=count[i];
                index=i;
            }
        }
        System.out.println((char)('a'+index));
    }
}
