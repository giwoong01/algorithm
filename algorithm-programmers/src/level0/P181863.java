package src.level0;

/*
level-0
rny_string

입출력 예
rny_string	    result
"masterpiece"	"rnasterpiece"
"programmers"	"prograrnrners"
"jerry"	        "jerry"
"burn"	        "burn"
 */

public class P181863 {
    public static void main(String[] args) {
        String rny_string = "masterpiece";

        System.out.println(solution(rny_string));
    }

    public static String solution(String rny_string) {
        return rny_string.replaceAll("m", "rn");
    }

}
