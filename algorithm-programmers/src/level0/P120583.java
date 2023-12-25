package src.level0;

/*
level-0
중복된 숫자 개수

입출력 예
array	            n	result
[1, 1, 2, 3, 4, 5]	1	2
[0, 2, 3, 4]	    1	0
 */


public class P120583 {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,4,5};
        int n = 1;

        System.out.println(solution(array, n));
    }

    public static int solution(int[] array, int n) {
        int answer = 0;
        for (int i : array) {
            if (i == n) {
                answer++;
            }
        }

        return answer;
    }
}
