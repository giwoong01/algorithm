package src.level1;

/*
level-1
[PCCE 기출문제] 3번 / 수나누기

디버깅(Debugging)은 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
1줄만 수정하여 버그를 고치세요.
2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.
 */

import java.util.Scanner;

public class P340205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        while (number != 0) { // 수정한 라인
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}
