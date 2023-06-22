package src.level2;

// level-2
// 카펫 - (완전탐색)

// 입출력 예
// brown	yellow	return
// 10	    2	    [4, 3]
// 8	    1	    [3, 3]
// 24	    24	    [8, 6]

public class P42842 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;

        for (int i = 1; i < total; i++) {
            int x = total / i;
            int y = i;

            if ((x - 2) * (y - 2) == yellow) {
                answer[0] = x;
                answer[1] = y;
                break;
            }
        }

        return answer;
    }
}
