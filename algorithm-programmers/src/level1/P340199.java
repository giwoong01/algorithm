package src.level1;

/*
level-1
[PCCE 기출문제] 9번 / 지폐 접기

입출력 예
wallet	    bill	    result
[30, 15]	[26, 17]	1
[50, 50]	[100, 241]	4
 */

public class P340199 {
    public static void main(String[] args) {
        int[] wallet = {50, 50};
        int[] bill = {100, 241};

        System.out.println(solution(wallet, bill));
    }

    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;

        while (Math.min(bill[0], bill[1]) > Math.min(wallet[0], wallet[1]) || Math.max(bill[0], bill[1]) > Math.max(wallet[0], wallet[1])) {
            if (bill[0] > bill[1]) {
                bill[0] = (int) Math.floor((double) bill[0] / 2);
            } else {
                bill[1] = (int) Math.floor((double) bill[1] / 2);
            }

            answer++;
        }

        return answer;
    }
}
