package src.level2;

/*
level-2
큰 수 만들기

입출력 예
number	        k	return
"1924"	        2	"94"
"1231234"	    3	"3234"
"4177252841"	4	"775841"
 */

public class P42883 {
    public static void main(String[] args) {
        String number = "1924";
        int k = 2;

        System.out.println(solution(number, k));
    }

    public static String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int max;

        for (int i = 0; i < number.length() - k; i++) {
            max = 0;
            for (int j = index; j <= i + k; j++) {
                if (max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    index = j + 1;
                }
            }
            sb.append(max);
        }

        return sb.toString();
    }
}
