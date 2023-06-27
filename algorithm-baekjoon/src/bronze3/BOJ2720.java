package bronze3;

/*
세탁소 사장 동혁

-입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 거스름돈 C를 나타내는 정수 하나로 이루어져 있다. C의 단위는 센트이다. (1달러 = 100센트) (1<=C<=500)
-예
3
124
25
194

-출력
각 테스트케이스에 대해 필요한 쿼터의 개수, 다임의 개수, 니켈의 개수, 페니의 개수를 공백으로 구분하여 출력한다.
-예
4 2 0 4
1 0 0 0
7 1 1 4
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[4];

        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());

            arr[0] = C / 25;
            C %= 25;
            arr[1] = C / 10;
            C %= 10;
            arr[2] = C / 5;
            C %= 5;
            arr[3] = C;

            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
