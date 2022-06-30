import java.io.*;
import java.util.*;

public class itroToString {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if (A.compareTo(B)<0) {
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
         String f1 =A.substring(0,1);
         String f2 =A.substring(1);
         String f3 =B.substring(0,1);
         String f4 =B.substring(1);
        System.out.println(f1.toUpperCase()+f2+" "+f3.toUpperCase()+f4);
        
    }
}



