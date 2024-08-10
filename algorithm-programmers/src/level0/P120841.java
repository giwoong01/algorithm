package src.level0;

/*
level-0
점의 위치 구하기

입출력 예
dot	    result
[2, 4]	1
[-7, 9]	2
 */

public class P120841 {
    public static void main(String[] args) {
        int[] dot = {2,4};

        System.out.println(solution(dot));
    }

    public static int solution(int[] dot) {
        if (dot[0] > 0 && dot[1] > 0) {
            return 1;
        } else if (dot[0] > 0 && dot[1] < 0) {
            return 4;
        } else if (dot[0] < 0 && dot[1] > 0) {
            return 2;
        } else {
            return 3;
        }
    }
}
