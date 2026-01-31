package src.level1_2;

/*
입출력 예
N	answer
123	6
987	24
 */

public class P12931 {
    public static void main(String[] args) {
        int N = 123;

        System.out.println(solution(N));
    }

    public static int solution(int n) {
        int answer = 0;

        String s = String.valueOf(n);
        for (char c : s.toCharArray()) {
            answer+= Integer.parseInt(String.valueOf(c));
        }

        return answer;
    }
}
