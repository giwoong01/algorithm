package src.level1;

// level-2
// 두 개 뽑아서 더하기

// 입출력 예
// numbers	    result
// [2,1,3,4,1]	[2,3,4,5,6,7]
// [5,0,2,7]	[2,5,7,9,12]

import java.util.ArrayList;
import java.util.Collections;

public class P68644 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!arrayList.contains(numbers[i] + numbers[j])) {
                    arrayList.add(numbers[i] + numbers[j]);
                }
            }
        }

        Collections.sort(arrayList);

        int[] answer = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}
