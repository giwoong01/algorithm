package src.level1;

/*
level-1
완주하지 못한 선수

입출력 예
participant             	                        completion	                                return
["leo", "kiki", "eden"]	                            ["eden", "kiki"]	                        "leo"
["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
["mislav", "stanko", "mislav", "ana"]	            ["stanko", "ana", "mislav"]	                "mislav"
 */

import java.util.Arrays;
import java.util.HashMap;

public class P42576 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(solution2(participant, completion));
    }

    public static String solution2(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();

        for (String s : participant) {
            hm.merge(s, 1, Integer::sum);
        }

        for (String s : completion) {
            if (hm.containsKey(s)) {
                Integer integer = hm.get(s) - 1;
                hm.put(s, integer);
            }
        }

        for (String s : hm.keySet()) {
            if (hm.get(s) != 0) {
                answer = s;
            }
        }

        return answer;
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = completion[i - 1];
            }
        }

        if (answer.equals("")) {
            answer = participant[participant.length - 1];
        }

        return answer;
    }
}
