package src.level2;

/*
level-2
[3차] 압축

입출력 예제
msg	                        answer
KAKAO	                    [11, 1, 27, 15]
TOBEORNOTTOBEORTOBEORNOT	[20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34]
ABABABABABABABAB	        [1, 2, 27, 29, 28, 31, 30]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P17684 {

    public static void main(String[] args) {
        String msg = "KAKAO";

        System.out.println(Arrays.toString(solution(msg)));
    }

    public static int[] solution(String msg) {
        List<Integer> indexes = new ArrayList<>();
        Map<String, Integer> book = new HashMap<>();

        char word = 'A';
        for (int i = 1; i <= ('Z' - 'A') + 1; i++) {
            book.put(word + "", i);
            word += 1;
        }

        int idx = 0;
        while (idx < msg.length()) {
            String str = "";

            while (idx < msg.length()) {
                if (!book.containsKey(str + msg.charAt(idx))) {
                    break;
                } else {
                    str += msg.charAt(idx);
                }

                idx++;
            }
            indexes.add(book.get(str));

            if (idx < msg.length()) {
                book.put(str + msg.charAt(idx), book.size() + 1);
            }
        }

        return indexes.stream().mapToInt(Integer::intValue).toArray();
    }

}
