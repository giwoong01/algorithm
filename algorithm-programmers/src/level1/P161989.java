package src.level1;

// level-1
// 덧칠하기

// 입출력 예
// n	m	section	        result
// 8	4	[2, 3, 6]	    2
// 5	4	[1, 3]	        1
// 4	1	[1, 2, 3, 4]	4

public class P161989 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int x = 0;

        for (int i = 0; i < section.length; i++) {
            if (x < section[i]) {
                x = section[i] + m - 1;
                answer++;
            }
        }

        return answer;
    }
}
