package src.level1;

// level-1
// 숫자 짝궁

// 입출력 예
// X	    Y	        result
// "100"	"2345"	    "-1"
// "100"	"203045"	"0"
// "100"	"123450"	"10"
// "12321"	"42531"	    "321"
// "5525"	"1255"	    "552"

public class P131128 {
    public static void main(String[] args) {
        String X = "100";
        String Y = "2345";

        System.out.println(solution(X, Y));
    }

    public static String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();

        int[] xArr = new int[10];
        int[] yArr = new int[10];

        for (String x : X.split("")) {
            xArr[Integer.parseInt(x)] += 1;
        }
        for (String y : Y.split("")) {
            yArr[Integer.parseInt(y)] += 1;
        }

        for (int i = 9; i >= 0; i--) {
            while (xArr[i] > 0 && yArr[i] > 0) {
                sb.append(i);

                xArr[i]--;
                yArr[i]--;
            }
        }

        if ("".equals(sb.toString())) {
            return "-1";
        }
        if ("0".equals(sb.substring(0, 1))) {
            return "0";
        }

        return sb.toString();
    }
}
