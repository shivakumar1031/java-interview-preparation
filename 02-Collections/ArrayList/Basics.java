
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import java.util.List;
import java.util.Iterator;
public class Basics {
    public static void main(String[] args) {
        // ArrayList<Integer> List=new ArrayList<>(Arrays.asList(15,25,10,40,25,60,80,10,95,100));
        // // System.out.println("Array List of with forEach");
        // // List.forEach(val->System.out.print(val+" "));
        // // System.out.println();
        // // System.out.println("Array List of with Enhance for loop");

        // Iterator <Integer> iter=List.iterator();
        // // for(int i : List){
        // //     System.out.print(i+" ");
        // // }
        // // while(iter.hasNext()){
        // //     int val=iter.next();
        // //     System.out.print(val+" ");
        // // }
        // // System.out.println();
        // // System.out.println("Array List of with normal for");
        // // for(int i=0;i<List.size();i++){
        // //     System.out.print(List.get(i)+" ");
        // // }
        // // ArrayList<Integer> arr2 = new ArrayList<>();
        // // List<Integer> arr= new Vector<>();
        // // System.out.println(List.size()+" "+ arr2.size());

        // //printing first, second and middle elements 
        // System.out.println("First element: "+ List.get(0));
        // System.out.println("Middle element: "+ List.get(List.size()/2));
        // System.out.println("Last element: "+ List.get(List.size()-1));
        // for(int i=0;i<List.size();i++){
        //     if(List.get(i)==40){
        //         List.set(i,45);
        //     }
        // }
        // System.out.println(List);
        // List.set(4,50);
        // List.remove(4);
        // List.remove(6);
        // List.remove(Integer.valueOf(25));
        // System.out.println(List);
        // while (iter.hasNext()) {
        //     int val=iter.next();
        //     if(val==25){
        //         iter.remove();
        //         break;
        //     }     
        // }
        // System.out.println(List);
        // System.out.println(List.contains(95));
        // System.out.println(List);


        List<Integer> list = new ArrayList<>(List.of(15,25,10,40,25,60,80,10,95,100));
        System.out.println(list.contains(100));
        System.out.println(list.indexOf(80));
        for(int i=list.size()-1;i>=0;i--){
                System.out.println(list.get(i));
        }
        for(int i: list){
            if(i%2==0){
                System.out.println(i);
            }
        }
        for(int i: list){
            if(!(i%2==0)){
                System.out.println(i);
            }
        }
        int count=0;
        for(int val : list){
            count+=val;
        }
        System.out.println(count);
        System.out.println(count/list.size());
        int max=list.get(0),min=list.get(0);
        for(int val : list){
            if(val>max){
                max=val;
            }
            else
                min=val;
        }
        System.out.println("Max: "+max+" Min: "+min);

        //second largest element
        int firstmax=0,secmax=0;
        for(int i : list){
            if(firstmax<i){
                secmax=firstmax;
                firstmax=i;
            }
            else if(secmax<i){
                secmax=i;
            }
        }
        System.out.println("Second Max: "+secmax);
        int t=0;
        for(int i: list){
            if(i==10)
                t++;
        }
        System.out.println("number times 10 is occured: "+t);
        int c[]=new int[26];
        
    }
}
