package src.level2;

/*
level-2 DFS/BFS
타겟 넘버

입출력 예
numbers	        target	return
[1, 1, 1, 1, 1]	3	    5
[4, 1, 2, 1]	4	    2
 */

public class P43165 {

    static int count = 0;

    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1};
        int target = 4;

        System.out.println(solution(numbers, target));
    }

    public static int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return count;
    }

    private static void dfs(int[] numbers, int depth, int target, int result) {
        if (depth == numbers.length) {
            if (target == result) {
                count++;
            }

            return;
        }

        int plus = result + numbers[depth];
        int minus = result - numbers[depth];

        dfs(numbers, depth + 1, target, plus);
        dfs(numbers, depth + 1, target, minus);
    }

}
