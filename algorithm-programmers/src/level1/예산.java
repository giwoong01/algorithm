package src.level1;

// level-1
// 예산

// 입출력 예
//    d	        budget  result
//[1,3,2,5,4]	9	    3
//[2,2,3,3]	    10	    4

import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum > budget) {
                answer = i;
                break;
            }
        }
        if (sum <= budget) {
            answer = d.length;
        }
        return answer;
    }
}
