package silver4;

// 동전 0
// 첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
// 둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)

import java.util.Scanner;

public class BOJ11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coin = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            coin[i] = sc.nextInt();
        }

        for(int i = n - 1; i >= 0; i--){ // 가장 큰 가치를 지닌 동전부터 탐색
            if(coin[i] <= k){
                count += (k / coin[i]);
                k = k %coin[i];
            }
        }
        sc.close();
        System.out.println(count);
    }
}
