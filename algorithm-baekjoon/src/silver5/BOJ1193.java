package silver5;

// 분수찾기
// 이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
// X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int crossCount = 1; // 대각선
        int sumCrossCount = 0; // 누적 대각선 개수

        while (true) {
            if (x <= crossCount + sumCrossCount) {
                if (crossCount % 2 == 1) {
                    System.out.println((crossCount - (x - sumCrossCount - 1)) + "/" + (x - sumCrossCount));
                    break;
                } else {
                    System.out.println((x - sumCrossCount) + "/" + (crossCount - (x - sumCrossCount - 1)));
                    break;
                }
            } else {
                sumCrossCount += crossCount;
                crossCount++;
            }
        }
    }
}
