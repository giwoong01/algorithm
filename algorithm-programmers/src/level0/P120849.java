package src.level0;

/*
level-0
모음 제거

입출력 예
my_string	        result
"bus"	            "bs"
"nice to meet you"	"nc t mt y"
 */

public class P120849 {
    public static void main(String[] args) {
        String my_string = "bus";

        System.out.println(solution(my_string));
    }

    public static String solution(String my_string) {
        String answer = "";

        answer = my_string.replaceAll("[aeiou]", "");

        return answer;
    }
}
