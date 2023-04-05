package src.level0;

// level-0
// 연속된 수의 합

// 입출력 예
// num	total	result
// 3	12	    [3, 4, 5]
// 5	15	    [1, 2, 3, 4, 5]
// 4	14	    [2, 3, 4, 5]
// 5	5	    [-1, 0, 1, 2, 3]

public class P120923 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int mid = (total / num);
        int mul;

        if (total % num == 0) {
            mul = (num / 2);
        } else {
            mul = (num / 2) - 1;
        }

        for (int i = 0; i < num; i++) {
            answer[i] = mid - mul + i;
        }

        return answer;
    }
}
