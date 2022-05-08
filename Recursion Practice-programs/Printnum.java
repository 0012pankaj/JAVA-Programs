/* print number from 1-5 with recursion*/


public class Printnum{
    public static void printnumber(int n){
        if (n>5) {
            return;
        }

        System.out.println(n);
        printnumber(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printnumber(n);
    }
}
/*1
2
3
4
5 */