package src.level0;

/*
level-0
369게임

입출력 예
order	result
3	    1
29423	2
 */

public class P120891 {
    public static void main(String[] args) {
        int order = 3;

        System.out.println(solution(order));
    }

    public static int solution(int order) {
        int answer = 0;
        String orders = Integer.toString(order);
        String[] arr = orders.split("");

        for (String s : arr) {
            if (s.equals("3") || s.equals("6") || s.equals("9")) {
                answer++;
            }
        }

        return answer;
    }
}
