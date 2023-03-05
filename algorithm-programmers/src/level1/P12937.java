package src.level1;

// level-1
// 짝수와 홀수

public class P12937 {
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
