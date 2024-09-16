package src.level0;

/*
level-0
배열의 유사도

입출력 예
s1	            s2	                        result
["a", "b", "c"]	["com", "b", "d", "p", "c"]	2
["n", "omg"]	["m", "dot"]	            0
 */

public class P120903 {
    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        System.out.println(solution(s1, s2));
    }

    public static int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (String a : s1) {
            for (String b : s2) {
                if (a.equals(b)) {
                    answer++;
                }
            }
        }

        return answer;
    }

}
