package src.level2;

/*
level-2
[1차] 뉴스 클러스터링

예제 입출력
str1	    str2	    answer
FRANCE	    french	    16384
handshake	shake hands	65536
aa1+aa2	    AAAA12	    43690
E=M*C^2	    e=m*c^2	    65536
 */

import java.util.ArrayList;
import java.util.List;

public class P17677 {
    public static void main(String[] args) {
        String str1 = "E=M*C^2";
        String str2 = "e=m*c^2";

        System.out.println(solution(str1, str2));
    }

    public static int solution(String str1, String str2) {
        List<String> str1List = new ArrayList<>();
        List<String> str2List = new ArrayList<>();

        for (int i = 0; i < str1.length() - 1; i++) {
            String s = str1.toLowerCase().substring(i, i + 2).replaceAll("[^a-z]", "");

            if (s.length() < 2) {
                continue;
            }
            str1List.add(s);
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            String s = str2.toLowerCase().substring(i, i + 2).replaceAll("[^a-z]", "");

            if (s.length() < 2) {
                continue;
            }
            str2List.add(s);
        }

        if (str1List.isEmpty() && str2List.isEmpty()) {
            return 65536;
        }

        List<String> unionList = new ArrayList<>();
        List<String> intersectionList = new ArrayList<>();

        for (String s : str1List) {
            if (str2List.remove(s)) {
                intersectionList.add(s);
            }

            unionList.add(s);
        }

        unionList.addAll(str2List);

        return (int) ((double) intersectionList.size() / (double) unionList.size() * 65536);
    }
}
