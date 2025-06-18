package src.level0;

/*
level-0
잘라서 배열로 저장하기

입출력 예
my_str              n	result
"abc1Addfggg4556b"	6	["abc1Ad", "dfggg4", "556b"]
"abcdef123"	        3	["abc", "def", "123"]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P120913 {
    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        int n = 6;

        System.out.println(Arrays.toString(solution(my_str, n)));
    }

    public static String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < my_str.length() / n; i++) {
            list.add(my_str.substring(n * i, n * (i + 1)));
        }

        if (my_str.length() % n != 0) {
            list.add(my_str.substring((my_str.length() / n) * n));
        }

        return list.toArray(new String[0]);
    }
}
