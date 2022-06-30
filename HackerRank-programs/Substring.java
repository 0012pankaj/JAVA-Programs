import java.util.Scanner;
import java.util.Arrays;

public class Substring {

    // public static String getSmallestAndLargest(String s, int k) {
    //     String smallest = "";
    //     String largest = "";
        
    //     char[] arry= s.toCharArray();
    //     String[] str= new String[arry.length-k+1];
        
    //     for (int i = 0; i < arry.length-k+1; i++) {
    //         str[i]=s.substring(s.indexOf(arry[i]),s.indexOf(arry[i])+k);
    //     }
     
   
    // for(int i = 0; i<str.length-1; i++)   
    // {  
    // for (int j = i+1; j<str.length; j++)   
    // {  
   
    // if(str[i].compareTo(str[j])>0)   
    // {  
   
    // String temp = str[i];  
    // str[i] = str[j];  
    // str[j] = temp;  
    // }  
    // }  
    // }  

    // smallest=str[0];
    // largest=str[str.length-1];
    //     return smallest + "\n" + largest;
    // }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        java.util.List<String> a = new java.util.ArrayList<>();

        for(int i=0;i<s.length()-k+1;i++){
                a.add(s.substring(i,i+k));   
        }

        java.util.Collections.sort(a);
         smallest = a.get(0);
         largest = a.get(a.size()-1);
         return smallest + "\n" + largest;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}