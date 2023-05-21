package src.level0;

// level-0
// 대소문자 바꿔서 출력하기

import java.util.Scanner;

public class P181949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            if (Character.isLowerCase(c)) {
                answer.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            }
        }

        System.out.println(answer);
    }
}
