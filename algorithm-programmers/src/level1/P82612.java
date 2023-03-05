package src.level1;

// level-1
// 부족한 금액 계산하기

public class P82612 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += (long) price * i;
        }

        if (money >= sum) {
            return answer;
        } else {
            return sum - money;
        }
    }
}