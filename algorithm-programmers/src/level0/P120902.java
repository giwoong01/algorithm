package src.level0;

/*
level-0
문자열 계산하기

입출력 예
my_string	result
"3 + 4"	    7
 */

public class P120902 {
    public static void main(String[] args) {
        String my_string = "3 + 4";

        System.out.println(solution(my_string));
    }

    public static int solution(String my_string) {
        String[] split = my_string.split(" ");
        int answer = Integer.parseInt(split[0]);

        for (int i = 0; i < split.length; i++) {
            if (i % 2 == 1) {
                if (split[i].equals("+")) {
                    answer += Integer.parseInt(split[i + 1]);
                } else {
                    answer -= Integer.parseInt(split[i + 1]);
                }
            }
        }

        return answer;
    }
}
