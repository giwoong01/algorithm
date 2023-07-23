package bronze3;

/*
네 번째 점

입력
세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

출력
직사각형의 네 번째 점의 좌표를 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] arr = new int[3][2];
        int resultX = 0;
        int resultY = 0;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        if (arr[0][0] == arr[2][0]) {
            resultX = arr[1][0];
        } else if (arr[1][0] == arr[2][0]) {
            resultX = arr[0][0];
        } else {
            resultX = arr[2][0];
        }

        if (arr[0][1] == arr[1][1]) {
            resultY = arr[2][1];
        } else if (arr[1][1] == arr[2][1]) {
            resultY = arr[0][1];
        } else {
            resultY = arr[1][1];
        }

        System.out.println(resultX + " " + resultY);
    }
}
