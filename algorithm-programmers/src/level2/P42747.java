package src.level2;

// level-2
// H-Index

// 입출력 예
// citations	    return
// [3, 0, 6, 1, 5]	3

import java.util.Arrays;

public class P42747 {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};

        System.out.println(solution(citations));
    }

    public static int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;

            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }

        return answer;
    }
}
