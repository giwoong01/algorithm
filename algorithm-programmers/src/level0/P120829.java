package src.level0;

/*
level-0
각도기

입출력 예
angle	result
70	    1
91	    3
180	    4
 */

public class P120829 {
    public static void main(String[] args) {
        int angle = 70;

        System.out.println(solution(angle));
    }

    public static int solution(int angle) {
        if (angle > 0 && angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle > 90 && angle < 180) {
            return 3;
        } else {
            return 4;
        }
    }
}
