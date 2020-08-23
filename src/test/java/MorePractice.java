import java.util.HashSet;
import java.util.Set;

    public class MorePractice {

            public boolean isPalindrome(String word) {
                if (word.length() < 2) {
                    return false;
                }
                int i = 0;
                int j = word.length() - 1;
                while (i < j) {
                    if(word.charAt(i)!=word.charAt(j)) {
                        return false;
                    }
                    i++;
                    j--;
                }
                return true;
            }

            public Set<String> palindromesInSubstring(String word) {
                HashSet<String> palindromes = new HashSet<>();
                for(int i = 0; i < word.length(); i++) {
                    for(int  j = i+ 1; j <=word.length(); j++) {
                        if (isPalindrome(word.substring(i,j))) {
                            palindromes.add(word.substring(i,j));
                        }
                    }
                }
                return palindromes;
            }
        }

        class decision {
            public static void main (String[] args) {
                MorePractice practice = new MorePractice();
                System.out.println(practice.palindromesInSubstring("ghfafu"));
            }
        }
