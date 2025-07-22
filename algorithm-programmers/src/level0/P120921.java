package src.level0;

/*
level-0
문자열 밀기

입출력 예
A	     B	    result
"hello"	"ohell"	1
"apple"	"elppa"	-1
"atat"	"tata"	1
"abc"	"abc"	0
 */

public class P120921 {
    public static void main(String[] args) {
        String A = "hello";
        String B = "ohell";

        System.out.println(solution(A, B));
    }

    public static int solution(String A, String B) {
        if (A.equals(B)) {
            return 0;
        }

        for (int i = 0; i < A.length(); i++) {
            String s = A.substring(A.length() - i) + A.substring(0, A.length() - i);

            System.out.println(s);
            if (s.equals(B)) {
                return i;
            }
        }

        return -1;
    }
}

