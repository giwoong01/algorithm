package src.level1;

// level-1
// 개인정보 수집 유효기간

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P150370 {
    public static void main(String[] args) {
        String today = "2020.01.01";
        String[] terms = {"Z 3", "D 5"};
        String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

        int[] arr = solution(today, terms, privacies);
        System.out.println(Arrays.toString(arr));
    }

    /*
    today -> 2022.05.19
    2021.05.02 A -> 2021.11.01까지 보관가능 -> 파기
    2021.07.01 B -> 2022.06.28까지 보관가능 ->
    2022.02.19 C -> 2022.05.18까지 보관가능 -> 파기
    2022.02.20 C -> 2022.05.19까지 보관가능 ->
     */
    public static int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        String str = today.replace(".", "");

        for (int i = 0; i < privacies.length; i++) {
            String privacie = privacies[i].substring(0, 10);
            int year = Integer.parseInt(privacie.substring(0, 4));
            int month = Integer.parseInt(privacie.substring(5, 7));
            int date = Integer.parseInt(privacie.substring(8, 10));
            String type = privacies[i].substring(11, 12);

            for (String term : terms) {
                String termsType = term.substring(0, 1);
                int termsPlusMonth = Integer.parseInt(term.substring(2));

                if (type.equals(termsType)) {
                    month += termsPlusMonth;
                    date -= 1;

                    if (date < 1) {
                        month -= 1;
                        date = 28;
                    }
                    // month가 12이고, termsPlusMonth가 12여서 24일 때 아래 if 로 하면 month가 0이 되는 상황
                    if (month % 12 == 0) {
                        year += (month / 12) - 1;
                        month = 12;
                        break;
                    }

                    if (month > 12) {
                        int x = month / 12;
                        year += x;
                        month -= x * 12;
                        break;
                    }
                }
            }

            // 마지막 파기해야될 번호 추가
            StringBuilder result = new StringBuilder();
            result.append(year);
            if (Integer.toString(month).length() == 1) {
                result.append("0").append(month);
            } else {
                result.append(month);
            }
            if (Integer.toString(date).length() == 1) {
                result.append("0").append(date);
            } else {
                result.append(date);
            }

            if (Integer.parseInt(str) > Integer.parseInt(String.valueOf(result))) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(Integer :: intValue).toArray();
    }

}
