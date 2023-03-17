package silver5;

// 그룹 단어 체커
// 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
// 예를 들면, ccazzzzbb 는 c, a, z, b가 모두 연속해서 나타나고, kin 도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb 는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
// 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            boolean[] check = new boolean[26];
            boolean tmp = true;

            for (int j = 0; j < str.length(); j++) {
                int index = str.charAt(j) - 'a'; // 'a' 를 빼주는 이유는 int 값으로는 97이기때문에 알파벳 그대로 넣어버리면 check[index]에 오류가 생긴다. ex) check[97] 이렇게되면 오류임..
                if (check[index]) {
                    if (str.charAt(j) != str.charAt(j - 1)) {
                        tmp = false;
                        break;
                    }
                } else {
                    check[index] = true;
                }
            }

            if (tmp) {
                count++;
            }

        }

        System.out.println(count);
    }
}
