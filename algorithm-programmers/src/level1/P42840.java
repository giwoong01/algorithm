package src.level1;

// level-1
// 모의고사

// 입출력 예
// answers	    return
// [1,2,3,4,5]	[1]
// [1,3,2,4,2]	[1,2,3]

import java.util.ArrayList;
import java.util.List;

public class P42840 {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length]) count[0]++;
            if (answers[i] == b[i % b.length]) count[1]++;
            if (answers[i] == c[i % c.length]) count[2]++;
        }

        int maxScore = Math.max(count[0], Math.max(count[1], count[2]));
        List<Integer> list = new ArrayList<>();
        if (maxScore == count[0]) list.add(1);
        if (maxScore == count[1]) list.add(2);
        if (maxScore == count[2]) list.add(3);

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
