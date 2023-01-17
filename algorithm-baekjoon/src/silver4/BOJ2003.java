package silver4;

// 수 찾기
// N개의 수로 된 수열 A[1], A[2], …, A[N] 이 있다. 이 수열의 i번째 수부터 j번째 수까지의 합 A[i] + A[i+1] + … + A[j-1] + A[j]가 M이 되는 경우의 수를 구하는 프로그램을 작성하시오.

import java.util.*;

public class BOJ2003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int startPoint = 0, endPoint = 0, sum = 0, count = 0;
        while(true){
            if(sum >= m){
                sum -= arr[startPoint++];
            }
            else if(endPoint == n){
                break;
            }
            else{
                sum += arr[endPoint++];
            }
            if(sum == m){
                count++;
            }
        }
        System.out.println(count);
    }
}
