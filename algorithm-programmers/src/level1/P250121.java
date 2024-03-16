package src.level1;

/*
level-1
[PCCE 기출문제] 10번 / 데이터 분석

입출력 예
data	                                                                ext	    val_ext	    sort_by	    result
[[1, 20300104, 100, 80], [2, 20300804, 847, 37], [3, 20300401, 10, 8]]	"date"	20300501	"remain"	[[3,20300401,10,8],[1,20300104,100,80]]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P250121 {
    static int extIndex;
    static int sort_byIndex;
    public static void main(String[] args) {
        int[][] data = {
                {1, 20300104, 100, 80},
                {2, 20300804, 847, 37},
                {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        System.out.println((Arrays.deepToString(solution(data, ext, val_ext, sort_by))));
    }

    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};

        if (ext.equals("code")) extIndex = 0;
        if (ext.equals("date")) extIndex = 1;
        if (ext.equals("maximum")) extIndex = 2;
        if (ext.equals("remain")) extIndex = 3;

        if (sort_by.equals("code")) sort_byIndex = 0;
        if (sort_by.equals("date")) sort_byIndex = 1;
        if (sort_by.equals("maximum")) sort_byIndex = 2;
        if (sort_by.equals("remain")) sort_byIndex = 3;

        List<int[]> list = new ArrayList<>();

        for (int[] datum : data) {
            if (datum[extIndex] < val_ext) {
                list.add(datum);
            }
        }

        list.sort((o1, o2) -> {
            return o1[sort_byIndex] - o2[sort_byIndex];
        });

        answer = new int[list.size()][];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
