package bronze1;

// 평균
// 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
// 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다. 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

import java.util.*;

public class BOJ1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[sc.nextInt()];
        
        double max_num = 0; 
        double sum = 0;     

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();

            if(arr[i] > max_num){
                max_num = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            sum += (arr[i] / max_num) * 100;
        }

        System.out.println(sum / arr.length);

    }
}
