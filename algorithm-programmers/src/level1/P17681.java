package src.level1;

// level-1
// 비밀지도

// 입출력 예
// 매개변수	값
//  n	    5
//  arr1	[9, 20, 28, 18, 11]
//  arr2	[30, 1, 21, 17, 28]
//  출력	["#####","# # #", "### #", "# ##", "#####"]

public class P17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String str = Integer.toBinaryString(arr1[i] | arr2[i]);

            str = String.format("%" + n + "s", str);

            str = str.replace("1", "#");
            str = str.replace("0", " ");

            answer[i] = str;
        }

        return answer;
    }
}
