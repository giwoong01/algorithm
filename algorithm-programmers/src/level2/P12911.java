package src.level2;

// level-2
// 다음 큰 숫자

// 입출력 예
// n	result
// 78	83
// 15	23

public class P12911 {
    public int solution(int n) {
        int answer = n;

        int oneCount = 0;
        String binary = Integer.toBinaryString(n);

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') oneCount++;
        }

        while (true) {
            int nextCount = 0;
            answer += 1;
            String nextBinary = Integer.toBinaryString(answer);

            for (int i = 0; i < nextBinary.length(); i++) {
                if (nextBinary.charAt(i) == '1') nextCount++;
            }
            if (oneCount == nextCount) {
                break;
            }
        }


        return answer;
    }
}
