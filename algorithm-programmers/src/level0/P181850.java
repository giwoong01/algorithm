package src.level0;

/*
level-0
정수 부분

입출력 예
flo	    result
1.42	1
69.32	69
 */

public class P181850 {
    public static void main(String[] args) {
        double flo = 1.42;

        System.out.println(solution(flo));
    }

    public static int solution(double flo) {
        return (int) flo;
    }

}
