package silver5;

/*
정열적인 정렬 - 서브태스크

입력
첫째 줄에는 수열의 길이 N (1 ≤ N ≤ 500,000)이 주어진다.
둘째 줄에는 수열의 각 원소 ai가 공백을 사이에 두고 차례대로 주어진다. ai의 절댓값은 200만 이하이다.

출력
수열 a를 오름차순으로 정렬해서, 공백을 사이에 두고 하나씩 차곡차곡 출력하자.

서브태스크 1 (10점)
정렬하려 하는 배열의 길이 N이 N ≤ 1,000을 만족한다.

서브태스크 2 (15점)
문제에 제시된 조건 이외의 다른 제약은 없다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ16212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}
