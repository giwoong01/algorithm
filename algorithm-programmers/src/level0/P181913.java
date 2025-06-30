package src.level0;

/*
level-0
문자열 여러 번 뒤집기

입출력 예
my_string	    queries	                            result
"rermgorpsam"	[[2, 3], [0, 7], [5, 9], [6, 10]]	"programmers"
 */

public class P181913 {
    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};

        System.out.println(solution(my_string, queries));
    }

    public static String solution(String my_string, int[][] queries) {
        for (int[] query : queries) {
            StringBuilder sb = new StringBuilder();
            String substring = my_string.substring(query[0], query[1] + 1);
            sb.append(substring);
            sb.reverse();

            my_string = my_string.substring(0, query[0]) + sb + my_string.substring(query[1] + 1);
        }

        return my_string;
    }
}
