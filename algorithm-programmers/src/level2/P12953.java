package src.level2;

// level-2
// N개의 최소공배수

// 입출력 예
// arr	        result
// [2,6,8,14]	168
// [1,2,3]	    6

public class P12953 {
    public int solution(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        int gcd = getGcd(arr[0], arr[1]);
        int answer = (arr[0] * arr[1]) / gcd;

        if (arr.length == 2) {
            return answer;
        } else {
            for (int i = 2; i < arr.length; i++) {
                gcd = getGcd(answer, arr[i]);
                answer = (answer * arr[i]) / gcd;
            }
        }

        return answer;
    }

    public int getGcd(int a, int b) {
        int gcd = 0;
        for (int i = 1; i < a + b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
