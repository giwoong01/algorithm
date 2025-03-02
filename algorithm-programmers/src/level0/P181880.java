package src.level0;

/*
level-0
1로 만들기

입출력 예
num_list	        result
[12, 4, 15, 1, 14]	11
 */

public class P181880 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 1, 14};

        System.out.println((solution(num_list)));
    }

    public static int solution(int[] num_list) {
        int answer = 0;

        for (int i : num_list) {
            while (i != 1) {
                if (i % 2 == 0) {
                    i = i / 2;
                } else {
                    i = (i - 1) / 2;
                }

                answer++;
            }
        }

        return answer;
    }
}
