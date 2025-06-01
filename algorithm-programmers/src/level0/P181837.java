package src.level0;

/*
level-0
커피 심부름

입출력 예
order	                                                    result
["cafelatte", "americanoice", "hotcafelatte", "anything"]	19000
["americanoice", "americano", "iceamericano"]	            13500
 */

public class P181837 {
    public static void main(String[] args) {
        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};

        System.out.println(solution(order));
    }

    public static int solution(String[] order) {
        int answer = 0;

        for (String s : order) {
            if (s.contains("americano") || s.equals("anything")) {
                answer += 4500;
            } else {
                answer += 5000;
            }
        }

        return answer;
    }
}
