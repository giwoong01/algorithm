package src.level1_2;

/*
입출력 예
n	return
118372	873211
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P12933 {
    public static void main(String[] args) {
        int n = 118372;

        System.out.println(solution(n));
    }

    public static long solution(long n) {
        List<Long> list = new ArrayList<>();
        String s = String.valueOf(n);
        for (char c : s.toCharArray()) {
            String s1 = String.valueOf(c);
            list.add(Long.valueOf(s1));
        }

        StringBuilder result = new StringBuilder();
        list.sort(Collections.reverseOrder());
        for (Long aLong : list) {
            result.append(aLong);
        }

        return Long.parseLong(result.toString());
    }
}
