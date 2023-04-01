package src.level2;

// level-2
// 영어 끝말잇기

// 입출력 예
// n	words	                                                                                                                                                            result
// 3	["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]	                                                                                    [3,3]
// 5	["hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"]	[0,0]
// 2	["hello", "one", "even", "never", "now", "world", "draw"]	                                                                                                        [1,3]

import java.util.ArrayList;
import java.util.List;

public class P12981 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (list.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }

            list.add(words[i]);

            if (i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
        }

        return answer;
    }
}