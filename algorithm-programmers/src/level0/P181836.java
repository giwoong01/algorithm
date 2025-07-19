package src.level0;

/*
level-0
그림 확대

입출력 예
picture         	    k	result
["x.x", ".x.", "x.x"]	3	["xxx...xxx", "xxx...xxx", "xxx...xxx", "...xxx...", "...xxx...", "...xxx...", "xxx...xxx", "xxx...xxx", "xxx...xxx"]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181836 {
    public static void main(String[] args) {
        String[] picture = {"x.x", ".x.", "x.x"};
        int k = 3;

        System.out.println(Arrays.toString(solution(picture, k)));
    }

    public static String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        for (String s : picture) {
            StringBuilder sb = new StringBuilder();
            String[] split = s.split("");

            for (String string : split) {
                sb.append(string.repeat(k));
            }

            for (int i = 0; i < k; i++) {
                answer.add(sb.toString());
            }
        }

        return answer.toArray(new String[0]);
    }
}
