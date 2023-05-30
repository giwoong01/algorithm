package bronze3;

// 열 개씩 끊어 출력하기
// 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
// 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int NLength = N.length() / 10;

        int index = 0;
        for (int i = 0; i < NLength; i++) {
            System.out.println(N.substring(index, index + 10));
            index += 10;
        }

        System.out.println(N.substring(N.length()- (N.length() % 10)));

    }
}
