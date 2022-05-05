public class ReverseString {
    public static void main(String[] args) {

        String str="pankaj atri";
        String rev="";
        for (int i = str.length()-1; i >=0; i--) {
           rev= rev+ str.charAt(i);
            
        } 
        System.out.println("Orignal string="+str);
        System.out.println("reversed string="+rev);
       
    }
}
/* Orignal string=pankaj atri
reversed string=irta jaknap*/
