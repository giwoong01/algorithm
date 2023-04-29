package src.level1;

// level-1
// 달리기 경주

// 입출력 예
// players	                             callings	                     result
//["mumu", "soe", "poe", "kai", "mine"]	 ["kai", "kai", "mine", "mine"]   ["mumu", "kai", "mine", "soe", "poe"]

import java.util.HashMap;

class P178871 {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> hm = new HashMap<>();
        HashMap<Integer, String> swapHm = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            hm.put(players[i], i);
            swapHm.put(i, players[i]);
        }

        for (int i = 0; i < callings.length; i++) {
            int curValue = hm.get(callings[i]);

            hm.replace(swapHm.get(curValue - 1), curValue);
            hm.replace(callings[i], --curValue);

            String swapValue = swapHm.get(curValue);

            swapHm.replace(curValue, callings[i]);
            swapHm.replace(curValue + 1, swapValue);
        }

        String[] answer = new String[swapHm.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = swapHm.get(i);
        }

        return answer;
    }
}