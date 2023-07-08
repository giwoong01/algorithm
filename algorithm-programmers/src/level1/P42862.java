package src.level1;

/*
level-1
체육복

입출력 예
n	lost	reserve	    return
5	[2, 4]	[1, 3, 5]	5
5	[2, 4]	[3]	        4
3	[3]	    [1]	        2
 */

public class P42862 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        System.out.println(solution(n, lost, reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] check = new int[n];

        for (int i : reserve) {
            check[i - 1] += 1;
        }
        for (int i : lost) {
            check[i - 1] -= 1;
        }

        for (int i = 0; i < check.length; i++) {
            if (check[i] == 1) {
                if (i != 0 && check[i - 1] == -1) {
                    check[i - 1] += 1;
                } else if (i != n - 1 && check[i + 1] == -1) {
                    check[i + 1] += 1;
                }
            }
        }

        for (int j : check) {
            if (j == -1) answer -= 1;
        }

        return answer;
    }
}
