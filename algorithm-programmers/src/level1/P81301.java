package src.level1;

// level-1
// 숫자 문자열과 영단어

// 입출력 예
// s	                result
// "one4seveneight"	    1478
// "23four5six7"     	234567
// "2three45sixseven"	234567
// "123"	123

public class P81301 {
    public int solution(String s) {
        int answer = 0;
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < s.length(); i++) {
            s = s.replace(str[i] , Integer.toString(i));
        }

        answer = Integer.parseInt(s);

        return answer;
    }
}
