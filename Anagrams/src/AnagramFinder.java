public class AnagramFinder {
    public static void main(String[] argv) {
        long startTime = System.nanoTime();
        String result = Anagram.anagramFinder(argv[0],argv[1]);
        long stop = (System.nanoTime() - startTime) / 1000;
        System.out.println(stop + result);
    }
}
