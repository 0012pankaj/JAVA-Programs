import java.io.*;
import java.util.Scanner;
public class staticblock {
    static int B,H;
    static boolean flag;
static{ 
    Scanner sc = new Scanner(System.in);
     B=sc.nextInt();
     H=sc.nextInt();
    flag = true;
   
   if(B<=0 || H<=0){
       System.out.println("java.lang.Exception: Breadth andheight must be positive");     
       flag=false;}
       else{
           
       }
     
}
   
public static void main(String[] args){
    if(flag){
        int area=B*H;
        System.out.print(area);
    }
    
}//end of main

}//end of class


