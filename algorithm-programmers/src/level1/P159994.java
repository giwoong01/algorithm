package src.level1;

// level-1
// 카드 뭉치

// 입출력 예
// cards1	                cards2	        goal	                                result
// ["i", "drink", "water"]	["want", "to"]	["i", "want", "to", "drink", "water"]	"Yes"
// ["i", "water", "drink"]	["want", "to"]	["i", "want", "to", "drink", "water"]	"No"

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P159994 {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> cards1Queue = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> cards2Queue = new LinkedList<>(Arrays.asList(cards2));
        Queue<String> goalQueue = new LinkedList<>(Arrays.asList(goal));

        while (!goalQueue.isEmpty()) {
            String str = goalQueue.peek();

            if (str.equals(cards1Queue.peek())) {
                cards1Queue.poll();
                goalQueue.poll();
            } else if (str.equals(cards2Queue.peek())) {
                cards2Queue.poll();
                goalQueue.poll();
            } else {
                break;
            }
        }

        return goalQueue.isEmpty() ? "Yes" : "No";
    }
}
