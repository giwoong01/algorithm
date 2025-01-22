package src.level0;

/*
level-0
특별한 이차원 배열 2

입출력 예
arr	                                                                                result
[[5, 192, 33], [192, 72, 95], [33, 95, 999]]	                                    1
[[19, 498, 258, 587], [63, 93, 7, 754], [258, 7, 1000, 723], [587, 754, 723, 81]]	0
 */

public class P181831 {
    public static void main(String[] args) {
        int[][] arr = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};

        System.out.println(solution(arr));
    }

    public static int solution(int[][] arr) {
        int answer = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }

        return answer;
    }
}
