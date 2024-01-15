package src.level2;

/*
level-2
전화번호 목록

입출력 예제
phone_book	                        return
["119", "97674223", "1195524421"]	false
["123","456","789"]                	true
["12","123","1235","567","88"]	    false
 */

import java.util.Arrays;
import java.util.HashMap;

public class P42577 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};

        System.out.println(solutionHash(phone_book));
    }

    public static boolean solutionHash(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            hm.put(phone_book[i], i);
        }

        for (String s : phone_book) {
            for (int j = 0; j < s.length(); j++) {
                if (hm.containsKey(s.substring(0, j))) {
                    return false;
                }
            }
        }

        return answer;
    }
}
