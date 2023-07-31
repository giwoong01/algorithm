package silver5;

/*
크로아디아 알파벳

크로아티아 알파벳	변경
    č	        c=
    ć	        c-
    dž	        dz=
    đ	        d-
    lj	        lj
    nj	        nj
    š	        s=
    ž	        z=

입력
첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.

출력
입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int result = str.length();

        for (int i = 0; i < str.length(); i++) {
            if (str.contains("c=")) {
                result -= 1;
                str = str.replaceFirst("c=", "0");
            } else if (str.contains("c-")) {
                result -= 1;
                str = str.replaceFirst("c-", "0");
            } else if (str.contains("dz=")) {
                result -= 2;
                str = str.replaceFirst("dz=", "0");
            } else if (str.contains("d-")) {
                result -= 1;
                str = str.replaceFirst("d-", "0");
            } else if (str.contains("lj")) {
                result -= 1;
                str = str.replaceFirst("lj", "0");
            } else if (str.contains("nj")) {
                result -= 1;
                str = str.replaceFirst("nj", "0");
            } else if (str.contains("s=")) {
                result -= 1;
                str = str.replaceFirst("s=", "0");
            } else if (str.contains("z=")) {
                result -= 1;
                str = str.replaceFirst("z=", "0");
            }
        }

        System.out.println(result);
    }
}
