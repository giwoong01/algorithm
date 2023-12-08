package src.level0;

/*
level-0
첫 번째로 나오는 음수

입출력 예
num_list	                result
[12, 4, 15, 46, 38, -2, 15]	5
[13, 22, 53, 24, 15, 6]	    -1
*/

public class P181896 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, -2, 15};

        System.out.println(solution(num_list));
    }

    public static int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }

        return -1;
    }
}
