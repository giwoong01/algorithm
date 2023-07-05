package bronze5;

/*
큰 수 A+B

-입력
첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)
-예
9223372036854775807 9223372036854775808

-출력
첫째 줄에 A+B를 출력한다.
-예
18446744073709551615
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ10757 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());

        System.out.println(A.add(B));
    }
}
