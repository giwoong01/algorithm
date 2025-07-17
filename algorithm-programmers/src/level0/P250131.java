package src.level0;

/*
level-0
[PCCE 기출문제] 3번 / 나이 계산

입력 #1
2000
Korea

출력 #1
31
 */

import java.util.Scanner;

public class P250131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals(
                "Korea"
        )) {
            answer =
                    2030 - year + 1
            ;
        }
        else if (age_type.equals("Year")) {

            answer = 2030 - year
            ;
        }

        System.out.println(answer);
    }
}
