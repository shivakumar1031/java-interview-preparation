import java.util.Scanner;
public  class PrintDuplicateCharacters{

    /* Printing duplicates 
    -> first we need to count frequency of the characters with using string length
    -> Now we know the duplicate with no of times occur 
    -> Put a condition which check and pass the value if it frequency is more than 1 and it should be first time passing
    (becasue in string more duplicates so we should allow it only one single time thats why we used boolean[]) 
    -> we used str.length() becasue output should be in insertion order not in alphabetic */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean[] b = new boolean[26];
        StringBuilder sb = new StringBuilder();

        int count[] = new int[26];

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            count[ch-'a']++;
        }
         for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)-'a']>1 && b[str.charAt(i)-'a']==false){
                sb.append(str.charAt(i));
                b[str.charAt(i)-'a']=true;
            }
         }

        
        if(sb.isEmpty())
            System.out.println("No duplicates");
        else
            System.out.println(sb);
    }
}