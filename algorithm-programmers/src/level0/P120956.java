package src.level0;

// level-0
// 옹알이

//입출력 예
// babbling	                                    result
// ["aya", "yee", "u", "maa", "wyeoo"]	        1
// ["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]	3

public class P120956 {
    public int solution(String[] babbling) {
        int answer = 0;

        for (String s : babbling) {
            if (s.replace("aya", " ")
                    .replace("ye", " ")
                    .replace("woo", " ")
                    .replace("ma", " ").trim().equals("")) answer++;
        }

        return answer;
    }
}
