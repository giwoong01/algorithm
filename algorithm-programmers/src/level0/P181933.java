package src.level0;

/*
level-0
flag에 따라 다른 값 반환하기

입출력 예
a	b	flag	result
-4	7	true	3
-4	7	false	-11
 */

public class P181933 {
    public static void main(String[] args) {
        int a = -4;
        int b = 7;
        boolean flag = true;

        System.out.println(solution(a, b, flag));
    }

    public static int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}
