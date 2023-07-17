package src.level1;

/*
level-1
서울에서 김서 찾기

입출력 예
seoul	        return
["Jane", "Kim"]	"김서방은 1에 있다"
 */

public class P12919 {
    public String solution(String[] seoul) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim"))
                answer.append("김서방은 ").append(i).append("에 있다");
        }
        return answer.toString();
    }
}
