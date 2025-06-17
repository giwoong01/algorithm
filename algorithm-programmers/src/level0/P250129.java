package src.level0;

/*
level-0
[PCCE 기출문제] 5번 / 산책

입출력 예
route	            result
"NSSNEWWN"	        [-1, 1]
"EESEEWNWSNWWNS"	[0, 0]
 */

import java.util.Arrays;

public class P250129 {
    public static void main(String[] args) {
        String route = "NSSNEWWN";

        System.out.println(Arrays.toString(solution(route)));
    }

    public static int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}
