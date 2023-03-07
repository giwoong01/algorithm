package src.level2;

// level2
// 최댓값과 최솟값

//입출력 예
//s	            return
//"1 2 3 4"	    "1 4"
//"-1 -2 -3 -4"	"-4 -1"
//"-1 -1"	    "-1 -1"

public class P12939 {
    public String solution(String s) {
        String[] arr = s.split(" ");

        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);

        for (String value : arr) {
            if (Integer.parseInt(value) > max) {
                max = Integer.parseInt(value);
            }
            if (Integer.parseInt(value) < min) {
                min = Integer.parseInt(value);
            }
        }

        return min + " " + max;
    }
}
