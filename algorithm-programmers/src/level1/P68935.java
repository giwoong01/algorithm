package src.level1;

// level-1
// 3진법 뒤집기

public class P68935 {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer = (answer * 3) + (n % 3);
            n /= 3;
        }

        return answer;
    }
}