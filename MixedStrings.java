public class MixedStrings {

    public static void main(String[] args) {
        String input = "This is PP2 Fall 2021";
        String result = swapFirstLast(input);
        
        System.out.println("Giriş: " + input);
        System.out.println("Çıkış: " + result);
    }

    public static String swapFirstLast(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        // Cümleyi boşluklara göre kelimelere ayırıyoruz
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String swappedWord;

            if (word.length() <= 1) {
                // Kelime tek harfliyse işlem yapmaya gerek yok
                swappedWord = word;
            } else {
                // İlk harf, orta kısım ve son harfi ayırıp yer değiştiriyoruz
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() - 1);
                
                swappedWord = last + middle + first;
            }

            result.append(swappedWord);

            // Kelimeler arasına boşluk ekliyoruz (son kelime hariç)
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}