package src.level1;

/*
level-1
[PCCE 기출문제] 2번 / 각도 합치기

디버깅(Debugging)은 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
1줄만 수정하여 버그를 고치세요.
2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.
 */

import java.util.Scanner;

public class P340206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = (angle1 + angle2) % 360; // 수정한 라인
        System.out.println(sum_angle);
    }
}
