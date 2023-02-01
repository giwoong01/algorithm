package src.level1;

// level-1
// 짝수와 홀수

public class 짝수와홀수 {
    class Solution {
        public String solution(int num) {
            String answer = "";
            if (num % 2 == 0) {
                answer = "Even";
            } else {
                answer = "Odd";
            }
            return answer;
        }
    }
}
