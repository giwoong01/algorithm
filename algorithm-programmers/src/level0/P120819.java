package src.level0;

/*
level-0
아이스 아메리카노

입출력 예
money	result
5,500	[1, 0]
15,000	[2, 4000]
 */

import java.util.Arrays;

public class P120819 {
    public static void main(String[] args) {
        int money = 5500;

        System.out.println(Arrays.toString(solution(money)));
    }

    public static int[] solution(int money) {
        int[] answer = new int[2];

        answer[0] = money / 5500;
        answer[1] = money % 5500;

        return  answer;
    }
}
