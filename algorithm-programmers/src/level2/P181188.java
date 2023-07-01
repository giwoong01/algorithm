package src.level2;

/*
level-2
요격 시스템

입출력 예
targets	                                            result
[[4,5],[4,8],[10,14],[11,13],[5,12],[3,7],[1,4]]	3
 */

import java.util.Arrays;

public class P181188 {
    public static void main(String[] args) {
        int[][] targets = {{4, 5}, {4, 8}, {10, 14}, {11, 13}, {5, 12}, {3, 7}, {1, 4}};

        System.out.println(solution(targets));
    }

    public static int solution(int[][] targets) {
        int answer = 0;

        Arrays.sort(targets, (o1, o2) -> {
            if (o1[1] == o2[1])
                return o1[0] - o2[0];
            return o1[1] - o2[1];
        });

        int endNum = 0;
        for (int[] target : targets) {
            if (endNum <= target[0]) {
                endNum = target[1];
                answer++;
            }
        }

        return answer;
    }
}
