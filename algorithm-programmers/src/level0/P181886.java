package src.level0;

/*
level-0
5명씩

입출력 예
names	                                                    result
["nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"]	["nami", "vex"]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181886 {
    public static void main(String[] args) {
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};

        System.out.println(Arrays.toString(solution(names)));
    }

    public static String[] solution(String[] names) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                answer.add(names[i]);
            }
        }

        return answer.toArray(new String[0]);
    }
}
