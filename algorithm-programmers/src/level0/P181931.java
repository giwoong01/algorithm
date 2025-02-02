package src.level0;

/*
level-0
등차수열의 특정한 항만 더하기

입출력 예
a	d	included	                                        result
3	4	[true, false, false, true, true]	                37
7	1	[false, false, false, true, false, false, false]	10
 */

public class P181931 {
    public static void main(String[] args) {
        int a = 3;
        int d = 4;
        boolean[] included = {true, false, false, true, true};

        System.out.println(solution(a, d, included));
    }

    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + (d * i);
            }
        }

        return answer;
    }
}
