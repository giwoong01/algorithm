package src.level1;

/*
level-1
햄버거 만들기

입출력 예
ingredient	                    result
[2, 1, 1, 2, 3, 1, 2, 3, 1]	    2
[1, 3, 2, 1, 2, 1, 3, 1, 2]	    0
1 2 3 1 순서로만 빵을 만들 수 있음.
1 - 빵
2 - 야채
3 - 고기
 */

public class P133502 {
    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

        System.out.println(solution(ingredient));
    }

    // StringBuilder로 푸는 방법
    public static int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int i : ingredient) {
            sb.append(i);

            if (sb.length() > 3 &&
                    sb.charAt(sb.length() - 4) == '1' &&
                    sb.charAt(sb.length() - 3) == '2' &&
                    sb.charAt(sb.length() - 2) == '3' &&
                    sb.charAt(sb.length() - 1) == '1') {
                answer++;
                sb = new StringBuilder(sb.substring(0, sb.length() - 4));
            }
        }

        return answer;
    }

    // 배열로 푼는 방법
    public static int solution2(int[] ingredient) {
        int answer = 0;

        int[] stack = new int[ingredient.length];
        int idx = 0;

        for (int j : ingredient) {
            stack[idx++] = j;

            if (stack.length > 3 &&
                    stack[idx - 1] == 1 &&
                    stack[idx - 2] == 3 &&
                    stack[idx - 3] == 2 &&
                    stack[idx - 4] == 1) {
                answer++;
                idx -= 4;
            }
        }

        return answer;
    }

}
