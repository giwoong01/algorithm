package silver4;

// 수 찾기
// N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
// 이분탐색

import java.util.*;

public class BOJ1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int m = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (binarySearch(arr, sc.nextInt()) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(int[] arr, int key) {
        int lo = 0;                 // 탐색범위의 왼쪽 끝 인덱스
        int hi = arr.length - 1;    // 탐색범위의 오른쪽 끝 인덱스

        while (lo <= hi) {
            int mid = (lo + hi) / 2; // 중간위치

            if (key < arr[mid]) {      // key 값이 중간위치보의 값보다 작을 경우
                hi = mid - 1;
            } else if (key > arr[mid]) { // key 값이 중간위치의 값보다 클 경우
                lo = mid + 1;
            } else {                    // key 값이 중간위치의 값과 같을 경우
                return mid;
            }
        }

        return -1;

    }
}