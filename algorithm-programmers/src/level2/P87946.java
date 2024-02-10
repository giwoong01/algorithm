package src.level2;

/*
level-2
피로도

입출력 예
k	dungeons	                result
80	[[80,20],[50,40],[30,10]]	3
 */

public class P87946 {

    public static int answer = -1;
    public static boolean[] prime;

    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        System.out.println(solution(k, dungeons));
    }

    public static int solution(int k, int[][] dungeons) {
        prime = new boolean[dungeons.length];
        dfs(0, k, dungeons);

        return answer;
    }

    public static void dfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!prime[i] && dungeons[i][0] <= k) {
                prime[i] = true;
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                prime[i] = false;
            }
        }

        answer = Math.max(answer, depth);
    }

}
