package src.level0;

/*
level-0
겹치는 선분의 길이

입출력 예
lines	                    result
[[0, 1], [2, 5], [3, 9]]	2
[[-1, 1], [1, 3], [3, 9]]	0
[[0, 5], [3, 9], [1, 10]]	8
 */

import java.util.Arrays;

public class P120876 {
    public static void main(String[] args) {
        int[][] lines = {{0, 5}, {3, 9}, {1, 10}};

        System.out.println(solution(lines));
    }

    public static int solution(int[][] lines) {
        int answer = 0;

        Arrays.sort(lines, ((o1, o2) -> {
            return o1[0] - o2[0];
        }));

        int prevStart = lines[0][0];
        int prevEnd = lines[0][1];

        for (int i = 1; i < lines.length; i++) {
            int[] line = lines[i];

            int nowStart = Math.max(prevStart, line[0]);
            int nowEnd = Math.min(prevEnd, line[1]);

            if (nowStart < nowEnd) {
                answer += nowEnd - nowStart;

                prevStart = nowEnd;
                prevEnd = Math.max(prevEnd, line[1]);
            } else {
                prevStart = line[0];
                prevEnd = line[1];
            }

        }

        return answer;
    }
}
