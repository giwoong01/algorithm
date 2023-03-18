package src.level1;

// level-1
// 푸드 파이트 대회

// 입출력 예
// food	        result
// [1, 3, 4, 6]	"1223330333221"
// [1, 7, 1, 2]	"111303111"

public class P134240 {
    public StringBuilder solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        StringBuilder stb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 != 0) {
                food[i] -= 1;
            }

            for (int j = 0; j < food[i] / 2; j++) {
                if (food[i] != 0) {
                    stb.append(i);
                }
            }
        }

        answer.append(stb).append(0).append(stb.reverse());

        return answer;
    }
}