package src.level0;

/*
level-0
l로 만들기

입출력 예
myString	    result
"abcdevwxyz"	"lllllvwxyz"
"jjnnllkkmm"	"llnnllllmm"
 */

public class P181834 {
    public static void main(String[] args) {
        String myString = "abcdevwxyz";

        System.out.println(solution(myString));
    }

    public static String solution(String myString) {
        String answer = myString;

        for (char c : myString.toCharArray()) {
            if (c < 'l') {
                answer = answer.replace(c, 'l');
            }
        }

        return answer;
    }
}
