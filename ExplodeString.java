public class ExplodeString {

    public static String explode(String input) {
        StringBuilder result = new StringBuilder();
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            current.append(input.charAt(i));
            result.append(current);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Baku";
        String exploded = explode(input);
        System.out.println(exploded);  
    }
}
