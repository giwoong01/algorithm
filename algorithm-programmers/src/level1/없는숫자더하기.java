package src.level1;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 45;

        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }
        return answer;
    }
}
