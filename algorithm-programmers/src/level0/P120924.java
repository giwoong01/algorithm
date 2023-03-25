package src.level0;

// level-0
// 다음에 올 숫자

// common	    result
// [1, 2, 3, 4]	5
// [2, 4, 8]	16

public class P120924 {
    public int solution(int[] common) {
        int answer = 0;

        if (common[1] - common[0] == common[2] - common[1]) {
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }

        return answer;
    }
}
