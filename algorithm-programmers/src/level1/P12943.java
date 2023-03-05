package src.level1;

// level-1
// 콜라츠 추측

public class P12943 {
    public int solution(int num) {
        int answer = 0;
        int x = num;

        while (x != 1) {
            if (x % 2 == 0) {
                x /= 2;
            } else if (x % 2 == 1) {
                x = (x * 3) + 1;
            }
            answer++;

            if (answer >= 500) {
                return -1;
            }
        }

        return answer;
    }
}
