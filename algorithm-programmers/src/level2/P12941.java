package src.level2;

// level-2
// 최솟값 만들기

// 입출력 예
// A	    B	        answer
//[1, 4, 2]	[5, 4, 4]	29
//[1,2]	    [3,4]	    10

import java.util.Arrays;

public class P12941 {
    public int solution(int []A, int[]B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }

        return answer;
    }
}