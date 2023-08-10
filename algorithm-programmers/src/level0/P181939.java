package src.level0;

public class P181939 {
    public static void main(String[] args) {
        int a = 9;
        int b = 91;

        System.out.println(solution(a, b));
    }

    public static int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int A = Integer.parseInt(String.valueOf(sb.append(a).append(b)));

        sb = new StringBuilder();
        int B = Integer.parseInt(String.valueOf(sb.append(b).append(a)));

        return Math.max(A, B);
    }
}
