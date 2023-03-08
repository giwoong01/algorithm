package src.level2;

// level-2
// JadenCase 문자열 만들기

// 입출력 예
//          s	                   return
//"3people unFollowed me"	"3people Unfollowed Me"
//"for the last week"	    "For The Last Week"

public class P12951 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String start = s.charAt(0) + "";

        answer.append(start.toUpperCase());

        for (int i = 1; i < s.length(); i++) {
            String str = s.charAt(i) + "";

            if (s.charAt(i - 1) == ' ') {
                answer.append(str.toUpperCase());
            } else {
                answer.append(str.toLowerCase());
            }
        }

        return answer.toString();
    }
}
