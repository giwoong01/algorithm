package src.level0;

/*
level-0
문자열이 몇 번 등장하는지 세기

입출력 예
myString	pat	result
"banana"	"ana"	2
"aaaa"	    "aa"	3
 */

public class P181871 {
    public static void main(String[] args) {
        String myString = "banana";
        String pat = "ana";

        System.out.println(solution(myString, pat));
    }

    public static int solution(String myString, String pat) {
        int answer = 0;

        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            if (myString.substring(i, pat.length() + i).equals(pat)) {
                answer++;
            }
        }

        return answer;
    }
}
