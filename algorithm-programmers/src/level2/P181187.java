package src.level2;

/*
level-2
두 원 사이의 정수 쌍

입출력 예
r1	r2	result
2	3	20
 */

public class P181187 {
    public static void main(String[] args) {
        int r1 = 2;
        int r2 = 3;

        System.out.println(solution(r1, r2));
    }

    public static long solution(int r1, int r2) {
        long answer = 0;

        for (int x = 1; x <= r2; x++) {
            long minY = (int) Math.ceil(Math.sqrt(1.0 * r1 * r1 - 1.0 * x * x));
            long maxY = (int) Math.floor(Math.sqrt(1.0 * r2 * r2 - 1.0 * x * x));

            answer += (maxY - minY + 1);
        }

        return answer * 4;
    }
}
