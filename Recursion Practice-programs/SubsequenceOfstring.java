public class SubsequenceOfstring {
    /* print all sub sequient of string */
     public static void subsequrt(String str,int i,String newstr){
         if(i==str.length()){
             System.out.println(newstr);
            return;
         }
           
         
         char cc=str.charAt(i);
         //to be added
         subsequrt(str,i+1,newstr+cc);
         // not want to be added
         subsequrt(str,i+1,newstr);


     }
    public static void main(String[] args) {
    String str="aaa";
    System.out.println("given string="+str);
    subsequrt(str,0,"");
    }
}
/* given string=abc   
abc
ab
ac
a
bc
b
c
given string=aaa
aaa
aa
aa
a
aa
a
a
   */