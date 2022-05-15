public class keybordCombinations {
    /* Print keypad combination */
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void combination(String str, int i, String combination) {
        if (i == str.length()) {
            System.out.println(combination);
            return;

        }
        char cc = str.charAt(i);
        String mapping = keypad[cc - '0'];
        for (int j = 0; j < mapping.length(); j++) {
            combination(str, i + 1, combination + mapping.charAt(j));
        }
    }

    public static void main(String[] args) {
        String str = "23";
        System.out.println("Geven string = " + str);
        System.out.println("All combination:-");
        combination(str, 0, "");
    }
}
/*
 * Geven string = 23
 * All combination:-
 * dg
 * dh
 * di
 * eg
 * eh
 * ei
 * fg
 * fh
 * fi
 */