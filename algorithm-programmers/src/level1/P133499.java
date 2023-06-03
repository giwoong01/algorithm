package src.level1;

// level-1
// 옹알이 (2)

// 입출력 예
// babbling                                         result
// ["aya", "yee", "u", "maa"]	                    1
// ["ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"]	2

public class P133499 {
    public int solution(String[] babbling) {
        int answer = 0;

        for (String s : babbling) {
            s = s.replaceAll("ayaaya|yeye|woowoo|mama", " ");
            s = s.replaceAll("aya|ye|woo|ma", "");
            if (s.equals("")) {
                answer++;
            }
        }

        return answer;
    }
}
