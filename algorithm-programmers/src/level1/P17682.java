package src.level1;

// level-1
// [1차] 다트게임

// S -> 1제곱, D -> 2제곱, T -> 3제곱
// * -> 해당 점수와 이전에 받은 점수 * 2
// # -> 해당 점수는 * (-1)

// 입출력 예
// 예제	dartResult	answer	설명
// 1	1S2D3T	    37	    1^1 * 2 + 2^2 * 2 + 3^3
// 2	1D2S#10S	9	    1^2 + 2^1 * (-1) + 10^1
// 3	1D2S0T	    3	    1^2 + 2^1 + 0^3
// 4	1S*2T*3S	23	    1^1 * 2 * 2 + 2^3 * 2 + 3^1
// 5	1D#2S*3S	5	    1^2 * (-1) * 2 + 2^1 * 2 + 3^1
// 6	1T2D3D#	    -4	    1^3 + 2^2 + 3^2 * (-1)
// 7	1D2S3T*	    59	    1^2 + 2^1 * 2 + 3^3 * 2

public class P17682 {
    public static void main(String[] args) {
        String dartResult = "1S*2T*3S";

        System.out.println(solution(dartResult));
    }

    public static int solution(String dartResult) {
        int answer = 0;

        int[] arr = new int[3];
        int index = 0;
        int n = 0;
        StringBuilder numStr = new StringBuilder();

        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);

            if (ch >= '0' && ch <= '9') {
                numStr.append(ch);
            } else if (ch == 'S' || ch == 'D' || ch == 'T') {
                n = Integer.parseInt(numStr.toString());
                if (ch == 'S') {
                    arr[index++] = (int) Math.pow(n, 1);
                } else if (ch == 'D') {
                    arr[index++] = (int) Math.pow(n, 2);
                } else {
                    arr[index++] = (int) Math.pow(n, 3);
                }
                numStr = new StringBuilder();
            } else {
                if (ch == '*') {
                    arr[index - 1] *= 2;
                    if (index - 2 >= 0) {
                        arr[index - 2] *= 2;
                    }
                } else {
                    arr[index - 1] *= (-1);
                }
            }
        }
        answer = arr[0] + arr[1] + arr[2];

        return answer;
    }
}
