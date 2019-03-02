import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagram {

    public static String anagramFinder(String filename, String input) {
        String answer = "";
        char[] inputArray = input.toCharArray();
        Arrays.sort(inputArray);
        try {
            FileInputStream fstream = new FileInputStream(filename);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                if (input.length() == strLine.length()){
                    answer += AlgorithmB.anagram(inputArray, strLine);
                }
            }
            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return answer;
    }
}
