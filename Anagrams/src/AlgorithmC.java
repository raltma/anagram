public class AlgorithmC {

    public static String anagram(String str1, String str2){
        char[] s1ToArray = str1.toCharArray();
        String copy = str2;
        for (char c : s1ToArray) {
            int index = str2.indexOf(c);
            if(index != -1)
            {
                copy = copy.substring(0, index)+copy.substring(index+1, copy.length());
            }else {
                return "";
            }
            return ", " + str2;

        }
        return "";
    }
}
