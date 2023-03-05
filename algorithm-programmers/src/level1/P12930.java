package src.level1;

// level-1
// 이상한 문자 만들기

// 입력 : "try hello world"
// 출력 : "TrY HeLlO WoRlD"

public class P12930 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split("");

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (arr[i].equals(" ")) {
                cnt = 0;
            } else if (cnt % 2 == 0) {
                arr[i] = arr[i].toUpperCase();
                cnt++;
            } else {
                arr[i] = arr[i].toLowerCase();
                cnt++;
            }
            answer.append(arr[i]);
        }
        return answer.toString();
    }
}
