package src.level0;

/*
level-0
수 조작하기 2

입출력 예
numLog	                                    result
[0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1]	"wsdawsdassw"
 */

public class P181925 {
    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};

        System.out.println(solution(numLog));
    }

    public static String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < numLog.length; i++) {
            if (numLog[i] - numLog[i - 1]  == 1) {
                sb.append("w");
            } else if (numLog[i] - numLog[i - 1] == -1) {
                sb.append("s");
            } else if (numLog[i] - numLog[i - 1] == 10) {
                sb.append("d");
            } else {
                sb.append("a");
            }
        }

        return String.valueOf(sb);
    }
}
