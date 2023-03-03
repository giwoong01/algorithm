package bronze5;

// 코딩은 체육과목 입니다.
// 혜아는 책에 있는 정수 자료형과 관련된 내용을 기억해 냈다. 책에는 long int는
// 4바이트 정수까지 저장할 수 있는 정수 자료형이고 long long int는
// 8바이트 정수까지 저장할 수 있는 정수 자료형이라고 적혀 있었다. 혜아는 이런 생각이 들었다. “int 앞에 long을 하나씩 더 붙일 때마다
// 4바이트씩 저장할 수 있는 공간이 늘어나는 걸까? 분명 long long long int는
// 12바이트, long long long long int는
// 16바이트까지 저장할 수 있는 정수 자료형일 거야!” 그렇게 혜아는 당황하는 면접관의 얼굴을 뒤로한 채 칠판에 정수 자료형을 써 내려가기 시작했다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder str = new StringBuilder("long int");

        for (int i = 1; i < N / 4; i++) {
            str.insert(0,"long ");
        }
        System.out.println(str);
    }
}
