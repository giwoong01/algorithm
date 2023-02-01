package src.level1;

// level-1
// 약수찾기

public class 약수찾기 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    answer += i;
                }
            }
            return answer;
        }
    }
}
