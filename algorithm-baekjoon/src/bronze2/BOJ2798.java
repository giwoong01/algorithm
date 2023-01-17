package bronze2;

// 블랙잭
// 첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
// 합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.

import java.util.*;

public class BOJ2798 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        int[] arr = new int[n];
    
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        int result = search(arr, n, m);
        System.out.println(result);
        s.close();
    }
    
    // 탐색
    static int search(int[] arr, int n, int m){
        int result = 0;

        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    int temp = arr[i] + arr[j] + arr[k];
                    if(m == temp){
                        return temp;
                    }
                    if(result < temp && temp < m){
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
