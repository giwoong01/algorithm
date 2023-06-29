package bronze3;

/*
중앙 이동 알고리즘

-입력
첫째 줄에 N이 주어진다. (1 ≤ N ≤ 15)
-예
1
2
5

-출력
첫째 줄에 과정을 N번 거친 후 점의 수를 출력한다.
-예
9
25
1089
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2903 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int pointLength = 2;
        int dif = 1;

        for (int i = 0; i < N; i++) {
            pointLength += dif;
            dif *= 2;
        }

        System.out.println(pointLength * pointLength);
    }
}
