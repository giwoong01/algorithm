package src.level0;

/*
level-0
외계행성의 나이

입출력 예
age	result
23	"cd"
51	"fb"
100	"baa"
 */

public class P120834 {
    public static void main(String[] args) {
        int age = 23;

        System.out.println(solution(age));
    }

    public static String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String ageString = String.valueOf(age);

        for (char c : ageString.toCharArray()) {
            if (c == '0') {
                sb.append("a");
            } else if (c == '1') {
                sb.append("b");
            } else if (c == '2') {
                sb.append("c");
            } else if (c == '3') {
                sb.append("d");
            } else if (c == '4') {
                sb.append("e");
            } else if (c == '5') {
                sb.append("f");
            } else if (c == '6') {
                sb.append("g");
            } else if (c == '7') {
                sb.append("h");
            } else if (c == '8') {
                sb.append("i");
            } else {
                sb.append("j");
            }
        }

        return sb.toString();
    }
}
