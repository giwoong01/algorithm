package src.level0;

/*
level-0
9로 나눈 나머지

입출력 예
number	                result
"123"	                6
"78720646226947352489"	2
 */

public class P181914 {
    public static void main(String[] args) {
        String number = "123";

        System.out.println(solution(number));
    }

    public static int solution(String number) {
        int answer = 0;

        for (char c : number.toCharArray()) {
            answer += Integer.parseInt(String.valueOf(c));
        }

        return answer % 9;
    }
}
