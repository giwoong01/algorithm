package src.level0;

/*
level-0
이어 붙인 수

입출력 예
num_list	    result
[3, 4, 5, 2, 1]	393
[5, 7, 8, 3]	581
 */

public class P181928 {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};

        System.out.println(solution(num_list));
    }

    public static int solution(int[] num_list) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int j : num_list) {
            if (j % 2 == 0) {
                sb1.append(j);
            } else {
                sb2.append(j);
            }

        }

        return Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
    }
}
