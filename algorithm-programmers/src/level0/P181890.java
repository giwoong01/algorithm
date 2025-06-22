package src.level0;

/*
level-0
왼쪽 오른쪽

입출력 예
str_list	            result
["u", "u", "l", "r"]	["u", "u"]
["l"]	                []
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181890 {
    public static void main(String[] args) {
        String[] str_list = {"r", "u", "u"};

        System.out.println(Arrays.toString(solution(str_list)));
    }

    public static String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                for (int j = 0; j < i; j++) {
                    list.add(str_list[j]);
                }

                return list.toArray(new String[0]);
            } else if (str_list[i].equals("r")) {
                for (int j = i + 1; j < str_list.length; j++) {
                    list.add(str_list[j]);
                }

                return list.toArray(new String[0]);
            }
        }

        return new String[]{};
    }

}
