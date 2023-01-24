package bronze2;

// 나머지
// 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오

import java.util.*;

public class BOJ3052 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        int temp = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt() % 42;
        }
        for (int i = 0; i < arr.length; i++) {
            temp = 0;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] == arr[k]) {
                    temp++;
                }
            }
            if (temp == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
