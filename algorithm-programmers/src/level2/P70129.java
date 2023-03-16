package src.level2;

// level-2
// 이진 변환 반복하기

// 입출력 예
// s	            result
// "110010101001"	[3,8]
// "01110"	        [3,3]
// "1111111"	    [4,1]

public class P70129 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count;
        while (!s.equals("1")) {
            answer[1] += s.length();
            s = s.replace("0", "");
            count = s.length();

            s = Integer.toBinaryString(count);
            answer[0]++;
            answer[1] -= count;
        }

        return answer;
    }
}
