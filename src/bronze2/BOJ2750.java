package bronze2;

// 수 정렬하기
// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

import java.util.*;

public class BOJ2750 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = s.nextInt();
        }

        for(int i = 0; i < num - 1; i++){
            for(int j = i + 1; j < num; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(int var : arr){
            System.out.println(var);
        }

        s.close();
    }
}
