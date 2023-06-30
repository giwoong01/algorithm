package src.level0;

/*
level-0
문자열 돌리기

입출력 예
입력 #1
abcde

출력 #1
a
b
c
d
e
 */

import java.util.Scanner;

public class P181945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split("");

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
