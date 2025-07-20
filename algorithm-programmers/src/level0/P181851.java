package src.level0;

/*
level-0
전국 대회 선발 고사

rank	                attendance	result
[3, 7, 2, 5, 4, 6, 1]	[false, true, true, true, true, false, false]	20403
[1, 2, 3]	            [true, true, true]	                            102
[6, 1, 5, 2, 3, 4]	    [true, false, true, false, false, true]	        50200
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P181851 {
    public static void main(String[] args) {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};

        System.out.println(solution(rank, attendance));
    }

    public static int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                list.add(rank[i]);
            }
        }

        Collections.sort(list);
        List<Integer> index = new ArrayList<>();

        for (Integer i : list.subList(0, 3)) {
            for (int j = 0; j < rank.length; j++) {
                if (i == rank[j]) {
                    index.add(j);
                }
            }
        }

        return (index.get(0) * 10000) + (index.get(1) * 100) + index.get(2);
    }
}
