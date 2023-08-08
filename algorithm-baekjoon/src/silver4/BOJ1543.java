package silver4;

/*
문서 검색

입력
첫째 줄에 문서가 주어진다. 문서의 길이는 최대 2500이다. 둘째 줄에 검색하고 싶은 단어가 주어진다. 이 길이는 최대 50이다. 문서와 단어는 알파벳 소문자와 공백으로 이루어져 있다.

출력
첫째 줄에 중복되지 않게 최대 몇 번 등장하는지 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String ans = br.readLine();

        String strReplaceAll = str.replaceAll(ans, "0");

        int count = 0;
        for (int i = 0; i < strReplaceAll.length(); i++) {
            if (strReplaceAll.charAt(i) == '0') {
                count++;
            }
        }

        System.out.println(count);
    }
}
