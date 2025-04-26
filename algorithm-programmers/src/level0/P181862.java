package src.level0;

/*
level-0
세 개의 구분자

입출력 예
myStr	                result
"baconlettucetomato"	["onlettu", "etom", "to"]
"abcd"	                ["d"]
"cabab"	                ["EMPTY"]
 */


import java.util.ArrayList;
import java.util.List;

public class P181862 {
    public static void main(String[] args) {
        String myStr = "baconlettucetomato";

        System.out.println(solution(myStr));
    }

    public static List<String> solution(String myStr) {
        List<String> answer = new ArrayList<>();

        for (String string : myStr.replaceAll("[abc]", " ").split(" ")) {
            if (!string.isEmpty()) {
                answer.add(string);
            }
        }

        return answer.isEmpty() ? List.of("EMPTY") : answer;
    }
}
