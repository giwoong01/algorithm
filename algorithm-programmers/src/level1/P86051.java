package src.level1;

// level-1
// 없는 숫자 더하기

public class P86051 {
    public int solution(int[] numbers) {
        int answer = 45;

        for (int number : numbers) {
            answer -= number;
        }
        return answer;
    }
}
