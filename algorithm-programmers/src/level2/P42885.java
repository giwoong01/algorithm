package src.level2;

// level-2
// 구명보트 - 탐욕법(Greedy)

// 입출력 예
// people	        limit	return
// [70, 50, 80, 50]	100	    3
// [70, 80, 50]	    100	    3

import java.util.Arrays;

public class P42885 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int index = 0;
        Arrays.sort(people);

        for (int i = people.length - 1; i >= index; i--) {
            if (people[i] + people[index] <= limit) {
                answer++;
                index++;
            } else {
                answer++;
            }
        }

        return answer;
    }
}