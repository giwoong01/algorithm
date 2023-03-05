package src.level1;

// level-1
// 음양 더하기

public class P76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                answer += absolutes[i];
            } else if (signs[i] == false) {
                answer += absolutes[i] * -1;
            }
        }
        return answer;
    }
}
