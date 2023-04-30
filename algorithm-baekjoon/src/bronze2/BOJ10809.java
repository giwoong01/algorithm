package bronze2;

// 알파벳 찾기
// 알파벳 소문자로만 이루어진 단어 S가 주어진다.
// 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
// 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
// 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] alphabet = new int[26];

        Arrays.fill(alphabet, -1);

        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - 'a';
            if (alphabet[n] == -1) {
                alphabet[n] = i;
            }
        }

        for (int j : alphabet) {
            System.out.print(j + " ");
        }
    }
}
