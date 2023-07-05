package src.level0;

/*
level-0
홀짝 구분하기

입출력 예
입력 #1   출력 #1
100      100 is even

입력 #2   출력 #2
1        1 is odd
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P181944 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(n % 2 == 0 ? n + " is even" : n + " is odd");
    }
}
