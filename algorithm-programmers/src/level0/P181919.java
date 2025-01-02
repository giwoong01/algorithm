package src.level0;

/*
level-0
콜라츠 수열 만들기

입출력 예
n	result
10	[10, 5, 16, 8, 4, 2, 1]
 */

import java.util.ArrayList;
import java.util.List;

public class P181919 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(solution(n));
    }

    public static List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();

        while (n != 1) {
            int x = n % 2 == 0 ? n / 2 : 3 * n + 1;
            answer.add(n);
            n = x;
        }

        answer.add(1);
        return answer;
    }

}
