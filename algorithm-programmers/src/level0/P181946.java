package src.level0;

// level0
// 문자열 붙여서 출력하기

import java.util.Scanner;

public class P181946 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        StringBuilder sb = new StringBuilder();
        sb.append(a).append(b);

        System.out.println(sb);
    }
}
