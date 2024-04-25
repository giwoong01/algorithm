package src.level0;

/*
level-0
개미 군단

입출력 예
hp	result
23	5
24	6
999	201
 */

public class P120837 {
    public static void main(String[] args) {
        int hp = 23;

        System.out.println(solution(hp));
    }

    public static int solution(int hp) {
        int answer = 0;

        while (hp > 0) {

            if (hp >= 5) {
                answer++;
                hp -= 5;
            } else if (hp >= 3) {
                answer++;
                hp -= 3;
            } else {
                answer++;
                hp -= 1;
            }
        }

        return answer;
    }
}
