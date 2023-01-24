package bronze3;


// 최댓값
// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

import java.util.*;

public class BOJ2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                count = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(count);
    }
}
