package src.level0;

/*
level-0
삼각형의 완성 조건 (2)

입출력 예
sides	result
[1, 2]	1
[3, 6]	5
[11, 7]	13
 */

public class P120868 {
    public static void main(String[] args) {
        int[] sides = {11, 7};

        System.out.println(solution(sides));
    }

    public static int solution(int[] sides) {
        int answer = 0;

        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        for (int i = 0; i <= max; i++) {
            if (i + min > max) {
                answer++;
            }
        }

        for (int i = max + 1; i < max + min; i++) {
            answer++;
        }

        return answer;
    }
}
