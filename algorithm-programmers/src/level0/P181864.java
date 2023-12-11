package src.level0;

/*
level-0
문자열 바꿔서 찾기

myString	pat	    result
"ABBAA"	    "AABB"	1
"ABAB"	    "ABAB"	0
*/

public class P181864 {
    public static void main(String[] args) {
        String myString = "ABBAA";
        String pat = "AABB";

        System.out.println(solution(myString, pat));
    }

    public static int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                sb.append("B");
            } else {
                sb.append("A");
            }
        }

        return sb.toString().contains(pat) ? 1 : 0;
    }
}
