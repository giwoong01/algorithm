package src.level0;

/*
level-0
암호 해독

입출력 예
cipher	                    code	result
"dfjardstddetckdaccccdegk"	4	    "attack"
"pfqallllabwaoclk"	        2	    "fallback"
 */

public class P120892 {
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;

        System.out.println(solution(cipher, code));
    }

    public static String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();

        for(int i = 1; i <= cipher.length(); i++) {
            if (i % code == 0) {
                answer.append(cipher.charAt(i - 1));
            }
        }

        return answer.toString();
    }
}
