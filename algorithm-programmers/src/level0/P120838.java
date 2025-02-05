package src.level0;

/*
level-0
모스부호 (1)

입출력 예
letter	                    result
".... . .-.. .-.. ---"	    "hello"
".--. -.-- - .... --- -."	"python"
 */

import java.util.Objects;

public class P120838 {
    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";

        System.out.println(solution(letter));
    }

    public static String solution(String letter) {
        StringBuilder answer = new StringBuilder();

        String[][] morse = {
                {".-", "a"}, {"-...", "b"}, {"-.-.", "c"}, {"-..", "d"}, {".", "e"}, {"..-.", "f"},
                {"--.", "g"}, {"....", "h"}, {"..", "i"}, {".---", "j"}, {"-.-", "k"}, {".-..", "l"},
                {"--", "m"}, {"-.", "n"}, {"---", "o"}, {".--.", "p"}, {"--.-", "q"}, {".-.", "r"},
                {"...", "s"}, {"-", "t"}, {"..-", "u"}, {"...-", "v"}, {".--", "w"}, {"-..-", "x"},
                {"-.--", "y"}, {"--..", "z"}
        };

        String[] split = letter.split(" ");
        for (String s : split) {
            for (String[] strings : morse) {
                if (Objects.equals(s, strings[0])) {
                    answer.append(strings[1]);
                }
            }
        }

        return answer.toString();
    }
}
