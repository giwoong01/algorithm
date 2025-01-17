package src.level0;

/*
level-0
숫자 찾기

입출력 예
num	    k	result
29183	1	3
232443	4	4
123456	7	-1
 */

public class P120904 {
    public static void main(String[] args) {
        int num = 123456;
        int k = 7;

        System.out.println(solution(num, k));
    }

    public static int solution(int num, int k) {
        int count = 0;

        for (char c : String.valueOf(num).toCharArray()) {
            count++;

            if (c - '0' == k) {
                return count;
            }
        }

        return -1;
    }
}
