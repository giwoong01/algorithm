package bronze2;

// 숫자의 개수
// 첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다.
// 마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String str = Integer.toString(A * B * C);

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((str.charAt(j) - '0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
