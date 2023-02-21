package src.level1;

// level-1
// 내적
// a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]

public class 내적 {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
