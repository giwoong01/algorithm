package src.level0;

/*
level-0
부분 문자열인지 확인하기

입출력 예
my_string	target	result
"banana"	"ana"	1
"banana"	"wxyz"	0
 */

public class P181843 {
    public static void main(String[] args) {
        String my_string = "banana";
        String target = "ana";

        System.out.println(solution(my_string, target));
    }

    public static int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
}
