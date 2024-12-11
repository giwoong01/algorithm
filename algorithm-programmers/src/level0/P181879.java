package src.level0;

/*
level-0
길이에 따른 연산

입출력 예
num_list	                            result
[3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1]	51
[2, 3, 4, 5]	                        120
*/

public class P181879 {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};

        System.out.println(solution(num_list));
    }

    public static int solution(int[] num_list) {
        int answer = 0;

        if (num_list.length >= 11) {
            for (int num : num_list) {
                answer += num;
            }
        } else {
            answer = 1;
            for (int num : num_list) {
                answer *= num;
            }
        }

        return answer;
    }
}
