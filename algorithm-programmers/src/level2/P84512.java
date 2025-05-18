package src.level2;

/*
level-2
모음사전

입출력 예
word	result
"AAAAE"	6
"AAAE"	10
"I"	    1563
"EIO"	1189
 */

import java.util.ArrayList;
import java.util.List;

public class P84512 {
    public static void main(String[] args) {
        String word = "I";

        System.out.println(solution(word));
    }

    public static int solution(String word) {
        String[] alphabets = {"A", "E", "I", "O", "U"};
        List<String> words = new ArrayList<>();

        generateWords("", alphabets, words);

        return words.indexOf(word) + 1;
    }

    private static void generateWords(String current, String[] alphabets, List<String> words) {
        if (current.length() > 5) {
            return;
        }

        if (!current.isEmpty()) {
            words.add(current);
        }

        for (String alphabet : alphabets) {
            generateWords(current + alphabet, alphabets, words);
        }
    }

}
