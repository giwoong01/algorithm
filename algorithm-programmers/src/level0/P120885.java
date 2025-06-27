package src.level0;

/*
level-0
이진수 더하기

입출력 예
bin1	bin2	result
"10"	"11"	"101"
"1001"	"1111"	"11000"
 */


public class P120885 {
    public static void main(String[] args) {
        String bin1 = "1001";
        String bin2 = "1111";

        System.out.println(solution(bin1, bin2));
    }

    public static String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }
}
