package src.level1;

// level-1
// 핸드폰 번호 가리기

public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        String answer = "";

        String x = "";

        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }

        x = phone_number.substring(phone_number.length() - 4);
        answer += x;

        return answer;
    }
}
