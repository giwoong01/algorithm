package src.level1_2;

/*
입출력 예
arr	        return
[1,2,3,4]	2.5
[5,5]	    5
 */

public class P12944 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(solution(arr));
    }

    public static double solution(int[] arr) {
        double answer = 0;

        for (int i : arr) {
            answer += i;
        }

        return answer / arr.length;
    }
}
