package silver5;

// 최소 공배수
// A와 B의 최소공배수를 한 줄에 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long commonMultiple = 0;

        for (int i = 1; i < A + B; i++) {
            if (A % i == 0 && B % i == 0) {
                commonMultiple = (A * B) / i;
            }
        }

        System.out.println(commonMultiple);
    }
}
