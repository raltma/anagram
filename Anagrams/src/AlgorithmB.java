import java.util.Arrays;
import java.util.Collections;

public class AlgorithmB {
    public static String anagram(char[] ch1, String word) {
        char[] ch2 = word.toLowerCase().toCharArray();
        Arrays.sort(ch2);
        if (Arrays.equals(ch1,ch2)){
            return "," + word;
        }
        return "";
    }
}
