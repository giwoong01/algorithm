package src.level1_2;

/*
입출력 예
participant	                                        completion	                                return
["leo", "kiki", "eden"]	                            ["eden", "kiki"]	                        "leo"
["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
["mislav", "stanko", "mislav", "ana"]	            ["stanko", "ana", "mislav"]	                "mislav"
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class P42576 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(solution(participant, completion));

        System.out.println(abc("{}()[]"));
//        System.out.println(a("abc"));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            map.put(s, map.getOrDefault(s, map.get(s)) - 1);
        }

        for (String s : map.keySet()) {
            if (map.get(s) > 0) {
                answer = s;
            }
        }

        return answer;
    }

    public static boolean abc(String input) {
        String[] parts = input.split("");

        Stack<String> stack = new Stack<>();
        for (String value : parts) {
            if (value.equals("(") || value.equals("[") || value.equals("{")) {
                stack.push(value);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                String top = stack.pop();

                if (Objects.equals(value, ")") && !Objects.equals(top, "(")) return false;
                if (Objects.equals(value, "]") && !Objects.equals(top, "[")) return false;
                if (Objects.equals(value, "}") && !Objects.equals(top, "{")) return false;
            }

        }

        return stack.isEmpty();
    }

    public static String a(String s) {
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                count++;
                continue;
            }

            sb.append(s.charAt(i)).append(count);
            count = 1;
        }

        sb.append(s.charAt(s.length() - 1)).append(count);

        return sb.toString();
    }
}
