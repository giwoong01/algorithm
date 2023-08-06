package src.level1;

// level-1
// 최소직사각형
// 입출력 예
// sizes	                                        result
// [[60, 50], [30, 70], [60, 30], [80, 40]]	        4000
// [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	120
// [[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	133

public class P86491 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        System.out.println(solution2(sizes));
    }

    public static int solution2(int[][] sizes) {
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < sizes[i].length; j++) {
                if (sizes[i][0] < sizes[i][1]) {
                    int tmp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = tmp;
                }

                max1 = Math.max(max1, sizes[i][0]);
                max2 = Math.max(max2, sizes[i][1]);
            }

        }
        return max1 * max2;
    }


    public int solution(int[][] sizes) {
        int maxRow = 0; // 최대 가로
        int maxCol = 0; // 최대 세로

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }

            if (maxRow < sizes[i][0]) maxRow = sizes[i][0];
            if (maxCol < sizes[i][1]) maxCol = sizes[i][1];
        }


        return maxRow * maxCol;
    }
}
