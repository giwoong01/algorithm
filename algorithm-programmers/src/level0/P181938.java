package src.level0;

/*
level-0
두 수의 연산값 비교하기

입출력 예
a	b	result
2	91	364
91	2	912
 */

public class P181938 {
    public static void main(String[] args) {
        int a = 2;
        int b = 91;

        System.out.println(solution(a, b));
    }

    public static int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int A = Integer.parseInt(String.valueOf(sb.append(a).append(b)));
        int B = 2 * a * b;

        return Math.max(A, B);
    }

}
