import java.util.HashSet;

public class UniqueSubsequience {

    /* print all sub sequient of string */
    public static void subsequrt(String str, int i, String newstr, HashSet<String> set) {
        if (i == str.length()) {
            if (set.contains(newstr)) {
                return;

            } else {
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }

        char cc = str.charAt(i);
        // to be added
        subsequrt(str, i + 1, newstr + cc, set);
        // not want to be added
        subsequrt(str, i + 1, newstr, set);

    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        System.out.println("given string=" + str);
        subsequrt(str, 0, "", set);
    }
}
/*given string=aaa
aaa
aa
a 
  */
