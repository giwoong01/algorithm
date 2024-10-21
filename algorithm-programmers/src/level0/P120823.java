package src.level0;

/*
level-0
직각삼각형 출력하기

입출력 예
입력
3

출력
*
**
***
 */

import java.util.Scanner;

public class P120823 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("*".repeat(i + 1));
        }

        sc.close();
    }
}
