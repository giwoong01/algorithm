package src.level1;

// level-1
// 가운데 글자 가져오기

public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        String[] sl = s.split("");

        if (s.length() % 2 == 1) {
            answer = sl[sl.length / 2];
        } else {
            answer = sl[sl.length / 2 - 1] + sl[sl.length / 2];
        }

        return answer;
    }
}
