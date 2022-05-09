public class MoveAllx {
    /* move all x in string at the end */
    public static void movex(String str,int i,int count,String estr){
        if (i==str.length()) {
            for (int j = 0; j <count; j++) {
                estr+="x";
            }
            System.out.println(estr);
            return;
        }

        char c=str.charAt(i);
     if (c=='x') {
         count++;
     }else{
       estr+=c;
     }
     movex(str,i+1,count,estr);

    }
    public static void main(String[] args) {
        String str ="axbcxxd";
        movex(str,0,0,"");
    }
}
/* abcdxxx */
