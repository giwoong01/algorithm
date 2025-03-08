package src.level0;

/*
level-0
k의 개수

입출력 예
i	j	k	result
1	13	1	6
10	50	5	5
3	10	2	0
 */

public class P120887 {
    public static void main(String[] args) {
        int i = 1;
        int j = 13;
        int k = 1;

        System.out.println(solution(i, j, k));
    }

    public static int solution(int i, int j, int k) {
        int answer = 0;

        String strK = String.valueOf(k);

        for (int a = i; a <= j; a++) {
            String s = String.valueOf(a);

            if (s.contains(strK)) {
                String[] split = s.split("");

                for (String string : split) {
                    if (string.equals(strK)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
