package src.level1;

// level-1
// 크기가 작은 부분 문자열

// 입출력 예
// t	            p	    result
//"3141592"	        "271"	2
//"500220839878"	"7" 	8
//"10203"	        "15"	3

public class P147355 {
    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            String str = t.substring(i, i + p.length());

            if (Long.parseLong(str) <= Long.parseLong(p)) {
                answer++;
            }
        }

        return answer;
    }
}
