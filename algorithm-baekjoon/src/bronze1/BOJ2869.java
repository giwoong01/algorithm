package bronze1;

/*
달팽이는 올라가고 싶다

-입력
첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
-예
2 1 5
5 1 6
100 99 100000000

-출력
첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
-예
4
2
999999901
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int count = (V - B) / (A - B);

        if ((V - B) % (A - B) != 0) {
            count++;
        }

        System.out.println(count);
    }
}

/*
2 1 5

2 -> 1 / 3 -> 2 / 4 -> 3 / 5 //
1일차 낮 : A
1일차 밤 : (A - B)
2일차 낮 : (A - B) + A
2일차 밤 : (A - B + A - B)
3일차 낮 : (A - B + A - B) + A
3일차 밤 : (A - B + A - B + A - B)
4일차 낮 : (A - B + A - B + A - B) + A
X일차 낮 : (A - B) * (X - 1) + A

V = AX - BX - A + B + A
V = AX - BX + B
V = X (A - B) + B
V - B = X (A - B)
X일차 구하는 수식 -> X = (V - B) / (A - B)
 */