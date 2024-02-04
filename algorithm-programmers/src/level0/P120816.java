package src.level0;

/*
level-0
피자 나눠 먹기(3)

입출력 예
slice	n	result
7	    10	2
4	    12	3
 */

public class P120816 {
    public static void main(String[] args) {
        int slice = 7;
        int n = 10;

        System.out.println(solution(slice, n));
    }

    public static int solution(int slice, int n) {
        int answer = 0;

        if (n % slice == 0) {
            answer = n / slice;
        } else {
            answer = (n / slice) + 1;
        }

        return answer;
    }
}
