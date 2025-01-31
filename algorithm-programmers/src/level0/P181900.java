package src.level0;

/*
level-0
글자 지우기

입출력 예
my_string	            indices	                        result
"apporoograpemmemprs"	[1, 16, 6, 15, 0, 10, 11, 3]	"programmers"
 */

public class P181900 {
    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

        System.out.println(solution(my_string, indices));
    }

    public static String solution(String my_string, int[] indices) {
        String[] split = my_string.split("");

        for (int index : indices) {
            split[index] = "";
        }

        return String.join("", split);
    }
}
