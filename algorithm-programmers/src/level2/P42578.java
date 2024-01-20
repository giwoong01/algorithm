package src.level2;

/*
level-2
의상

입출력 예
clothes	                                                                                    return
[["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]	5
[["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]]              3
 */

import java.util.HashMap;
import java.util.Map;

public class P42578 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> hm = new HashMap<>();

        for (String[] clothe : clothes) {
            hm.put(clothe[1], hm.getOrDefault(clothe[1], 0) + 1);
        }

        for (String s : hm.keySet()) {
            answer *= (hm.get(s) + 1);
        }

        return answer - 1;
    }
}
