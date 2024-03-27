package src.level1;

/*
level-1
[PCCP 기출문제] 1번 / 붕대 감기

입출력 예
bandage	    health	attacks	                                result
[5, 1, 5]	30	    [[2, 10], [9, 15], [10, 5], [11, 5]]	5
[3, 2, 7]	20	    [[1, 15], [5, 16], [8, 6]]	            -1
[4, 2, 7]	20	    [[1, 15], [5, 16], [8, 6]]	            -1
[1, 1, 1]	5	    [[1, 2], [3, 2]]	                    3
 */

public class P250137 {
    public static void main(String[] args) {
        int[] bandage = {5, 1, 5};
        int health = 30;
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};

        System.out.println(solution(bandage, health, attacks));
    }

    public static int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int continuousCount = 0;
        int attacksIndex = 0;

        for (int i = 1; i <= attacks[attacks.length - 1][0]; i++) {
            if (i == attacks[attacksIndex][0]) {
                answer -= attacks[attacksIndex][1];
                continuousCount = 0;
                attacksIndex++;
            } else {
                answer += bandage[1];
                continuousCount++;

                if (bandage[0] == continuousCount) {
                    answer += bandage[2];
                    continuousCount = 0;
                }
                if (answer > health) {
                    answer = health;
                }
            }

            if (answer <= 0) {
                return -1;
            }
        }

        return answer;
    }
}
