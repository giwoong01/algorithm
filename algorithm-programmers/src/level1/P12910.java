package src.level1;

// level-1
// 나누어 떨어지는 숫자 배열

import java.util.Arrays;

public class P12910 {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) count++;
        }

        if (count == 0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[count];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[j++] = arr[i];
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}
