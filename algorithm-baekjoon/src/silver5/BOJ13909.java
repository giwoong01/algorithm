package silver5;

/*
창문 닫기

입력
첫 번째 줄에는 창문의 개수와 사람의 수 N(1 ≤ N ≤ 2,100,000,000)이 주어진다.

출력
마지막에 열려 있는 창문의 개수를 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = (int)Math.sqrt(N);

        System.out.println(count);
    }
}
