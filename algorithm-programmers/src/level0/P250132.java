package src.level0;

/*
level-0
[PCCE 기출문제] 2번 / 피타고라스의 정리

입출력 예
입력 #1
3
5

출력 #1
16
 */

import java.util.Scanner;

public class P250132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (c * c) - (a * a);

        System.out.println(b_square);
    }
}
