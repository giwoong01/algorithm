package src.level0;

public class P120839 {
    public static void main(String[] args) {
        String rsp = "205";

        System.out.println(solution(rsp));
    }

    public static String solution(String rsp) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < rsp.length(); i++) {
            char c = rsp.charAt(i);

            if (c == '2') {
                answer.append("0");
            } else if (c == '0') {
                answer.append("5");
            } else {
                answer.append("2");
            }
        }

        return answer.toString();
    }
}
