package silver4;

// 한수
// 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

import java.util.*;

public class BOJ1065 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(ap(n));
    }

    public static int ap(int x){
        int count = 0;
        for(int i = 1; i <= x; i++){
            if(i < 100){ // 1~ 99 까지는 무조건 등차수열
                count++;
                continue;
            }
            int a = i % 10;
            int b = (i/10) % 10;
            int c = (i/100) % 10;
            if(a - b == b - c ){ // 셋째자리 - 둘째자리 == 둘째자리 - 첫째자리 같으면 공차 성립 = 등차수열
                count++;
            }
        }
        if(x == 1000){
            count--;
        }

        return count;
    }
}
