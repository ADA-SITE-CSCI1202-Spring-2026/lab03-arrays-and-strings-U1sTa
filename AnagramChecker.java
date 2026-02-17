import java.util.Arrays;

public class AnagramChecker {

    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String string1 = "listen";
        String string2 = "silent";

        if (isAnagram(string1, string2)) {
            System.out.println("Is anagram");
        } else {
            System.out.println("Not anagram");
        }
    }
}