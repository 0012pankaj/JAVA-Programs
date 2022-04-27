import java.util.Scanner;

public class PerfectSquare {
    static void  checkPerfect(int num){
        double n;
        n=Math.sqrt(num);
        if (n-(Math.floor(n))==0) {
            System.out.println(num+" is perfect Square.");
            
        } else {
            System.out.println(num+" is Not perfect Square.");
        }


    }
    public static void main(String[] args) {
        System.out.print("Enter number to check it is Perfect square or not=");
        Scanner sc= new Scanner(System.in);
        int num =sc.nextInt();
        checkPerfect(num);
    }
    
}

/*Enter number to check it is Perfect square or not=8100
8100 is perfect Square.*/
/*Enter number to check it is Perfect square or not=24
24 is Not perfect Square.*/