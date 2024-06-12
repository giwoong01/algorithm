package src.level0;

/*
level-0
수 조작하기 1

입출력 예
n	control	        result
0	"wsdawsdassw"	-1
 */

public class P181926 {
    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";

        System.out.println(solution(n, control));
    }

    public static int solution(int n, String control) {
        int answer = n;

        for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i) == 'w') {
                answer += 1;
            } else if (control.charAt(i) == 's') {
                answer -= 1;
            } else if (control.charAt(i) == 'd') {
                answer += 10;
            } else if (control.charAt(i) == 'a'){
                answer -= 10;
            } else {
                return answer;
            }
        }

        return answer;
    }
}
