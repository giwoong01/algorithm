package src.level3;

/*
level-3
베스트앨범

입출력 예
genres	                                        plays	                    return
["classic", "pop", "classic", "classic", "pop"]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P42579 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println(solution(genres, plays));
    }

    public static List<Integer> solution(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> genrePlayCount = new HashMap<>();
        Map<String, List<Map<Integer, Integer>>> map = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            Map<Integer, Integer> mapInt = new HashMap<>();
            mapInt.put(i, plays[i]);

            map.putIfAbsent(genres[i], new ArrayList<>());
            map.get(genres[i]).add(mapInt);

            genrePlayCount.put(genres[i], genrePlayCount.getOrDefault(genres[i], 0) + plays[i]);
        }

        List<String> sortedGenres = new ArrayList<>(map.keySet());
        sortedGenres.sort((a, b) -> genrePlayCount.get(b) - genrePlayCount.get(a));

        for (String genre : sortedGenres) {
            List<Map<Integer, Integer>> list = map.get(genre);
            list.sort((a, b) -> b.values().iterator().next() - a.values().iterator().next());
        }

        for (String genre : sortedGenres) {
            List<Map<Integer, Integer>> value = map.get(genre);
            int count = 0;

            for (Map<Integer, Integer> integerIntegerMap : value) {
                for (Integer i : integerIntegerMap.keySet()) {
                    if (count < 2) {
                        answer.add(i);
                        count++;
                    }
                }
            }
        }

        return answer;
    }

}
