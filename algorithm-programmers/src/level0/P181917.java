package src.level0;

/*
level-0
간단한 논리 연산

입출력 예
x1	    x2	    x3	    x4	    result
false	true	true	true	true
true	false	false	false	false
 */

public class P181917 {
    public static void main(String[] args) {
        boolean x1 = false;
        boolean x2 = true;
        boolean x3 = true;
        boolean x4 = true;

        System.out.println(solution(x1, x2, x3, x4));
    }

    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean x1x2 = true;
        boolean x3x4 = true;

        if (x1) {
            x1x2 = true;
        } else {
            if (!x2) {
                x1x2 = false;
            } else {
                x1x2 = true;
            }
        }

        if (x3) {
            x3x4 = true;
        } else {
            if (!x4) {
                x3x4 = false;
            } else {
                x3x4 = true;
            }
        }

        if (x1x2) {
            if (x3x4) {
                answer = true;
            } else {
                answer = false;
            }
        } else {
            answer = false;
        }

        return answer;
    }
}
