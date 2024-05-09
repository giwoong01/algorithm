package src.level0;

/*
level-0
주사위의 개수

입출력 예
box	        n	result
[1, 1, 1]	1	1
[10, 8, 6]	3	12
 */

public class P120845 {
    public static void main(String[] args) {
        int[] box = {1,1,1};
        int n = 1;

        System.out.println(solution(box, n));
    }

    public static int solution(int[] box, int n) {
        int answer = 1;

        for (int length : box) {
            answer *= length / n;
        }

        return answer;
    }
}
