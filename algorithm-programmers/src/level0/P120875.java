package src.level0;

/*
level-0
평행

입출력 예
dots	                            result
[[1, 4], [9, 2], [3, 8], [11, 6]]	1
[[3, 5], [4, 1], [2, 4], [5, 10]]	0
 */

public class P120875 {
    public static void main(String[] args) {
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};

        System.out.println(solution(dots));
    }

    public static int solution(int[][] dots) {
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = dots[1][0];
        int y2 = dots[1][1];
        int x3 = dots[2][0];
        int y3 = dots[2][1];
        int x4 = dots[3][0];
        int y4 = dots[3][1];

        double slope1 = (double) (y2 - y1) / (x2 - x1);
        double slope2 = (double) (y4 - y3) / (x4 - x3);
        if (slope1 == slope2) {
            return 1;
        }

        double slope3 = (double) (y3 - y1) / (x3 - x1);
        double slope4 = (double) (y4 - y2) / (x4 - x2);
        if (slope3 == slope4) {
            return 1;
        }

        double slope5 = (double) (y4 - y1) / (x4 - x1);
        double slope6 = (double) (y3 - y2) / (x3 - x2);
        if (slope5 == slope6) {
            return 1;
        }

        return 0;
    }
}
