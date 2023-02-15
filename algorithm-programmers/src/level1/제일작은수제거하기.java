package src.level1;

// level-1
// 제일 작은 수 제거하기

public class 제일작은수제거하기 {
    public int[] solution(int[] arr) {
        int min = arr[0];

        if (arr.length <= 1) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i]) {
                continue;
            } else {
                answer[index++] = arr[i];
            }
        }

        return answer;
    }
}
