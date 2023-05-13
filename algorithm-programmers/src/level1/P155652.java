package src.level1;

// level-1
// 둘만의 암호

// s	     skip	index	result
//"aukks"	"wbqd"	5	    "happy"

public class P155652 {
    public static String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char n = s.charAt(i);

            while (count != index) {
                n += 1;
                if (n > 'z') {
                    n -= 26;
                }
                if (!skip.contains(String.valueOf(n))) {
                    count++;
                }
            }
            count = 0;
            answer.append(n);
        }

        return answer.toString();
    }
}
