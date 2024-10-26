package src.level0;

/*
level-0
0 떼기

입출력 예
n_str	    result
"0010"	    "10"
"854020"	"854020"
 */

public class P181847 {

    public static void main(String[] args) {
        String n_str = "0010";

        System.out.println(solution(n_str));
    }

    public static String solution(String n_str) {
        String answer = n_str;

        for (int i = 0; i < n_str.length(); i++) {
            if(n_str.charAt(i) != '0') {
                break;
            }

            answer = answer.replaceFirst("0", "");
        }


        return answer;
    }
}
