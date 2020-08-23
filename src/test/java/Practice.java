import java.util.HashSet;
import java.util.Set;

import static com.sun.tools.corba.se.idl.InterfaceState.Public;

public class Practice {

    public static Set<String> findAllPalindromesUsingBruteForceApproach(String word) {
        HashSet<String> palindromes = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                if (isPoland(word.substring(i, j))) {
                    palindromes.add(word.substring(i, j));
                }
            }
        }
        System.out.println(palindromes.toString());
        return palindromes;
    }

    public static boolean isPoland(String word) {
        if (word.length() < 2) {
            return false;
        }
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}

class Solving {

public static void main(String[]args){
    Practice.findAllPalindromesUsingBruteForceApproach("ffivid");
}
}

