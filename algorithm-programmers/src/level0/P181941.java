package src.level0;

/*
level-0
문자 리스트를 문자열로 변환하기

arr	            result
["a","b","c"]	"abc"
 */

public class P181941 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};

        System.out.println(solution(arr));
    }

    public static String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();

        for (String s : arr) {
            answer.append(s);
        }

        return answer.toString();
    }
}
