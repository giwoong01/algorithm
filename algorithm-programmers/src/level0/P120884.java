package src.level0;

/*
level-0
치킨 쿠폰

입출력 예
chicken	result
100	    11
1,081	120
 */

public class P120884 {
    public static void main(String[] args) {
        int chicken = 1081;

        System.out.println(solution(chicken));
    }

    public static int solution(int chicken) {
        int answer = 0;
        int coupons = chicken;

        do {
            answer += (int) Math.floor(coupons / 10.0);
            coupons = (int) (Math.floor(coupons / 10.0) + (coupons % 10));
        } while (coupons != 0 && Math.floor(coupons / 10.0) != 0);

        return answer;
    }
}
