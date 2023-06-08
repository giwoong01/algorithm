package bronze1;

// 단어 공부
// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        str = str.toLowerCase();

        int[] alpha = new int[26];

        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                alpha[str.charAt(i) - 'a']++;
            }
        }

        int max = 0;
        char ch = '?';
        for (int i = 0; i < 26; i++) {
            if (alpha[i] > max) {
                max = alpha[i];
                ch = (char)(i + 'A');
            } else if (alpha[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
