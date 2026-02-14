package src.level1_2;

/*
입출력 예
num	return
3	"Odd"
4	"Even"
 */

public class P12937 {
    public static void main(String[] args) {
        int num = 3;

        System.out.println(solution(num));
    }

    public static String solution(int num) {
        if (num % 2 == 0) {
            return "Even";
        }

        return "Odd";
    }
}
