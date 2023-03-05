package src.level1;

// level-1
// 하샤드 수

public class P12947 {
    public boolean solution(int x) {
        boolean answer = true;
        int num = x;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        if (x % sum == 0)
            answer = true;
        else
            answer = false;

        return answer;
    }
}
