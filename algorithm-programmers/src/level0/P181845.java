package src.level0;

/*
level-0
문자열로 변환

입출력 예
n	    result
123	    "123"
2573	"2573"
 */

public class P181845 {
    public static void main(String[] args) {
        int n = 123;

        System.out.println(solution(n));
    }

    public static String solution(int n) {
        return Integer.toString(n);
    }
}
