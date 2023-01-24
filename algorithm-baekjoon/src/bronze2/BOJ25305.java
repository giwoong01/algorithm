package bronze2;

// 커트라인
// 첫째 줄에는 응시자의 수 N과 상을 받는 사람의 수 k가 공백을 사이에 두고 주어진다.
// 둘째 줄에는 각 학생의 점수 x가 공백을 사이에 두고 주어진다.

import java.util.*;

public class BOJ25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer x[] = new Integer[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(x, Collections.reverseOrder());
        System.out.println(x[k - 1]);
    }
}
