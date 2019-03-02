import java.util.HashMap;
import java.util.Map;

public class AlgorithmA {
    public static String anagram(Map<Character, Integer> input, String word){
        if(input.equals(frequencyMap(word))){
            return ", " + word;
        }
        return "";
    }

    public static Map<Character, Integer> frequencyMap(String str) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : str.toLowerCase().toCharArray()) {
            Integer frequency = map.get(c);
            map.put(c, frequency == null ? 1 : frequency+1);
        }
        return map;
    }
}
