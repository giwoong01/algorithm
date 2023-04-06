package src.level1;

// level-1
// 폰켓몬

// 입출력 예
// nums             result
// [3,1,2,3]	    2
// [3,3,3,2,2,4]	3
// [3,3,3,2,2,2]	2

import java.util.HashSet;
import java.util.Set;

public class P1845 {
    public int solution(int[] nums) {
        int answer = nums.length / 2;

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        if (answer > set.size()) {
            answer = set.size();
        }

        return answer;
    }
}
