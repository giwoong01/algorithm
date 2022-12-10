package silver3;

// 구간 합 구하기4
// 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
// 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.

import java.util.Scanner;

public class BOJ11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n+1];
        arr[0] = 0;

        for(int i = 1; i <= n; i++){
            arr[i] = arr[i-1] + sc.nextInt();
        }

        for(int k = 0; k < m; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();

            System.out.println(arr[j] - arr[i - 1]);
        }
        sc.close();
    }
}
