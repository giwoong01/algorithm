package src.level0;

/*
level-0
A 강조하기

입출력 예
myString	        result
"abstract algebra"	"AbstrAct AlgebrA"
"PrOgRaMmErS"	    "progrAmmers"
 */

public class P181874 {
    public static void main(String[] args) {
        String my_string = "abstract algebra";

        System.out.println(solution(my_string));
    }

    public static String solution(String myString) {
        return myString.toLowerCase().replaceAll("a", "A");
    }
}
