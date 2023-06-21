package src.level1;

// level-1
// 로또의 최고 순위와 최저 순위

// 입출력 예
// lottos	                win_nums	                result
// [44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	    [3, 5]
// [0, 0, 0, 0, 0, 0]	    [38, 19, 20, 40, 15, 25]	[1, 6]
// [45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]	    [1, 1]

import java.util.Arrays;

public class P77484 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        System.out.println(Arrays.toString(solution(lottos, win_nums)));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zeroCount = 0;

        for (int lotto : lottos) {
            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    count += 1;
                }
            }
            if (lotto == 0) {
                zeroCount += 1;
            }
        }

        answer[0] = getResult(count + zeroCount);
        answer[1] = getResult(count);

        return answer;
    }

    public static int getResult(int n) {
        if (n == 6) return 1;
        else if (n == 5) return 2;
        else if (n == 4) return 3;
        else if (n == 3) return 4;
        else if (n == 2) return 5;
        else return 6;
    }
}
