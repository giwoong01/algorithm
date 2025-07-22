package src.level0;

/*
level-0
직사각형 넓이 구하기

입출력 예
dots	                                result
[[1, 1], [2, 1], [2, 2], [1, 2]]	    1
[[-1, -1], [1, 1], [1, -1], [-1, 1]]	4
 */

public class P120860 {
    public static void main(String[] args) {
        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};

        System.out.println(solution(dots));
    }

    public static int solution(int[][] dots) {
        int minX = dots[0][0];
        int minY = dots[0][1];
        int maxX = dots[1][0];
        int maxY = dots[1][1];

        for (int[] dot : dots) {
            minX = Math.min(minX, dot[0]);
            minY = Math.min(minY, dot[1]);
            maxX = Math.max(maxX, dot[0]);
            maxY = Math.max(maxY, dot[1]);
        }

        return (maxX - minX) * (maxY - minY);
    }
}
