import java.util.Arrays;

public class SortString {

    public static String sortString(String input) {
        if (input == null) {
            return null;
        }

        char[] chars = input.toCharArray();
        Arrays.sort(chars);                   
        return new String(chars);             
    }

    public static void main(String[] args) {
        String str = "programming";
        String sorted = sortString(str);
        System.out.println("Original: " + str);
        System.out.println("Sorted: " + sorted);
    }
}

