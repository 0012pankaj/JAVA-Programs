import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class GCDorHCF {
    static void  giveGCD(int n1,int n2){
       int a=1;
      for (int i = 2; i <n1; i++) {
          if(n1%i==0 && n2%i==0){
              if(i>a){
                a=i; 
              } 

          }
      }
   System.out.println("HCF or GCD of "+n1+" and " +n2+"="+a);
    }
    public static void main(String[] args) {
        System.out.print("Enter two number for GCD or HCF =");
        Scanner sc = new Scanner(System.in);
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       giveGCD(n1,n2);
    }
    
}
