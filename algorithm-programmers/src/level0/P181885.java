package src.level0;

/*
level-0
할 일 목록

입출력 예
todo_list	                                                finished	                result
["problemsolving", "practiceguitar", "swim", "studygraph"]	[true, false, true, false]	["practiceguitar", "studygraph"]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181885 {
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};

        System.out.println(Arrays.toString(solution(todo_list, finished)));
    }

    public static String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();

        for(int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                answer.add(todo_list[i]);
            }
        }

        return answer.toArray(new String[0]);
    }
}
