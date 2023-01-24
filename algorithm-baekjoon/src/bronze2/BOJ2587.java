package bronze2;

// 대표값 2
// 다섯 개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램을 작성하시오.

import java.util.*;

public class BOJ2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            n[i] = sc.nextInt();
            sum += n[i];
        }

        Arrays.sort(n);

        System.out.println(sum / 5);
        System.out.println(n[2]);

        sc.close();
    }
}
