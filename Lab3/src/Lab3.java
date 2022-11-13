import java.util.Arrays;

/* 0414
    C3 = 0 -> StringBuilder
    C17 = 6 -> Відсортувати слова заданого тексту
    за зростанням кількості голосних літер.
*/

public class Lab3 {
    public static int counterOfVowels(String word) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (word.charAt(i) == vowels.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("thiiis is laboratory work 3");
        String[] words = text.toString().split(" ");
        Arrays.sort(words, (a, b) -> counterOfVowels(b) - counterOfVowels(a));
        String output = String.join(" ", words);
        System.out.println(output);
    }
}