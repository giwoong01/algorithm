package src.level0;

/*
level-0
나이 출력

age	result
40	1983
23	2000
 */

public class P120820 {
    public static void main(String[] args) {
        int age = 40;

        System.out.println(solution(age));
    }

    public static int solution(int age) {
        return 2022 - age + 1;
    }
}
