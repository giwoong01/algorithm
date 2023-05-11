package src.level1;

// level-1
// 대충 만든 자판

// 입출력 예
// keymap	            targets	        result
// ["ABACD", "BCEFD"]	["ABCD","AABB"]	[9, 4]
// ["AA"]	            ["B"]	        [-1]
// ["AGZ", "BSSS"]	    ["ASA","BGZ"]	[4, 6]

import java.util.HashMap;

public class P160586 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] result = new int[targets.length];

        HashMap<Character, Integer> keys = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                if (keys.containsKey(keymap[i].charAt(j))) {
                    if (keys.get(keymap[i].charAt(j)) > j) {
                        keys.put(keymap[i].charAt(j), j + 1);
                    }
                } else {
                    keys.put(keymap[i].charAt(j), j + 1);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                if (keys.containsKey(targets[i].charAt(j))) {
                    result[i] += keys.get(targets[i].charAt(j));
                    System.out.println(targets[i].charAt(j) + " " + i);
                } else {
                    result[i] = -1;
                    break;
                }
            }
        }

        return result;
    }
}
