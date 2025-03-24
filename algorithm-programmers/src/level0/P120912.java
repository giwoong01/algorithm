package src.level0;

/*
level-0
7의 개수

입출력 예
array	    result
[7, 77, 17]	4
[10, 29]	0

 */

public class P120912 {
    public static void main(String[] args) {
        int[] array = {7, 77, 17};

        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        int answer = 0;

        for (int i : array) {
            String strNumber = String.valueOf(i);

            for (char c : strNumber.toCharArray()) {
                if (Integer.parseInt(String.valueOf(c)) == 7) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
