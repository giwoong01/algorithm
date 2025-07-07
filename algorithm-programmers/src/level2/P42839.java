package src.level2;

/*
level-2
소수 찾기

입출력 예
numbers	return
"17"	3
"011"	2
 */

import java.util.HashSet;
import java.util.Set;

public class P42839 {
    static Set<Integer> set;
    static boolean[] visited = new boolean[7];

    public static void main(String[] args) {
        String numbers = "011";

        System.out.println(solution(numbers));
    }

    public static int solution(String numbers) {
        int answer = 0;

        set = new HashSet<>();
        DFS(numbers, "", 0);

        for (Integer i : set) {
            if (isPrime(i)) {
                answer++;
            }
        }

        return answer;
    }

    public static void DFS(String numbers, String s, int depth) {
        if (depth > numbers.length()) {
            return;
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                set.add(Integer.parseInt(s + numbers.charAt(i)));
                DFS(numbers, s + numbers.charAt(i), depth + 1);
                visited[i] = false;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
