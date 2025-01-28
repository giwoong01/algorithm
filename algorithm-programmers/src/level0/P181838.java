package src.level0;

/*
level-0
날짜 비교하기

입출력 예
date1	        date2	        result
[2021, 12, 28]	[2021, 12, 29]	1
[1024, 10, 24]	[1024, 10, 24]	0
 */

public class P181838 {
    public static void main(String[] args) {
        int[] date1 = {2021, 12, 28};
        int[] date2 = {2021, 12, 29};

        System.out.println(solution(date1, date2));
    }

    public static int solution(int[] date1, int[] date2) {
        int result = 0;

        for (int i = 0; i < date1.length; i++) {
            if (date1[i] != date2[i]) {
                result = date1[i] > date2[i] ? 0 : 1;
                break;
            }
        }

        return result;
    }
}
