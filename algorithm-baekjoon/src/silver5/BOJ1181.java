package silver5;

// 단어 정렬
// 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
// - 길이가 짧은 것부터
// - 길이가 같으면 사전 순으로
// 단, 중복된 단어는 하나만 남기고 제거해야 한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];

        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        Arrays.sort(str, (s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            } else {
                return s1.length() - s2.length();
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(str[0]).append('\n');
        for (int i = 1; i < N; i++) {
            if (!str[i].equals(str[i - 1])) {
                sb.append(str[i]).append('\n');
            }
        }

        System.out.println(sb);

    }
}
