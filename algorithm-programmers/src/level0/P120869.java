package src.level0;

/*
level-0
외계어 사전

입출력 예
spell	                dic	                                    result
["p", "o", "s"]	        ["sod", "eocd", "qixm", "adio", "soo"]	2
["z", "d", "x"]	        ["def", "dww", "dzx", "loveaw"]	        1
["s", "o", "m", "d"]	["moos", "dzx", "smm", "sunmmo", "som"]	2
 */

import java.util.ArrayList;
import java.util.List;

public class P120869 {
    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};

        System.out.println(solution(spell, dic));
    }

    public static int solution(String[] spell, String[] dic) {
        List<String> words = new ArrayList<>();

        generateWords("", spell, words);

        for (String s : dic) {
            if (words.contains(s)) {
                return 1;
            }
        }

        return 2;
    }

    private static void generateWords(String current, String[] alphabets, List<String> words) {
        if (!current.isEmpty() && current.length() == alphabets.length) {
            words.add(current);
        }

        for (String alphabet : alphabets) {
            if (!current.contains(alphabet)) {
                generateWords(current + alphabet, alphabets, words);
            }
        }
    }

}
