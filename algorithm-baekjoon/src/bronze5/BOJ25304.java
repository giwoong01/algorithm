package bronze5;

// 영수증
// 첫째 줄에는 영수증에 적힌 총 금액
// X가 주어진다.
// 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수
// N이 주어진다 이후
// N개의 줄에는 각 물건의 가격
// a와 개수
// b가 공백을 사이에 두고 주어진다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sum += a * b;
        }

        if (X == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
