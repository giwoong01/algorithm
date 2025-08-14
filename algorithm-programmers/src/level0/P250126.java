package src.level0;

/*
level-0
[PCCE 기출문제] 8번 / 창고 정리

입출력 예
storage	                                        num	                result
["pencil", "pencil", "pencil", "book"]	        [2, 4, 3, 1]	    "pencil"
["doll", "doll", "doll", "doll"]	            [1, 1, 1, 1]	    "doll"
["apple", "steel", "leaf", "apple", "leaf"]	    [5, 3, 5, 3, 7]	    "leaf"
["mirror", "net", "mirror", "net", "bottle"]	[4, 1, 4, 1, 5]	    "mirror"
 */

public class P250126 {
    public static void main(String[] args) {
        String[] storage = {"pencil", "pencil", "pencil", "book"};
        int[] num = {2, 4, 3, 1};

        System.out.println(solution(storage, num));
    }

    public static String solution(String[] storage, int[] num) {
        int num_item = 0;
        String[] clean_storage = new String[storage.length];
        int[] clean_num = new int[num.length];

        for (int i = 0; i < storage.length; i++) {
            int clean_idx = -1;
            for (int j = 0; j < num_item; j++) {
                if (storage[i].equals(clean_storage[j])) {
                    clean_idx = j;
                    break;
                }
            }
            if (clean_idx == -1) {
                clean_storage[num_item] = storage[i];
                clean_num[num_item] = num[i];
                num_item += 1;
            } else {
                clean_num[clean_idx] += num[i];
            }
        }

        // 아래 코드에는 틀린 부분이 없습니다.

        int num_max = -1;
        String answer = "";
        for (int i = 0; i < num_item; i++) {
            if (clean_num[i] > num_max) {
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }
        return answer;
    }
}
