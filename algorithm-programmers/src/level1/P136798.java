package src.level1;

/*
level-1
기사단원의 무기

입출력 예
number	limit	power	result
5	    3	    2	    10
10	    3	    2	    21
 */

class P136798 {
    public static void main(String[] args) {
        int number = 5;
        int limit = 3;
        int power = 2;

        System.out.println(solution(number, limit, power));
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int count = 0;

            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) {
                    count++;
                } else if (i % j == 0) {
                    count += 2;
                }
            }

            answer += count > limit ? power : count;
        }

        return answer;
    }
}