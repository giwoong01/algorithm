package src.level2;

/*
level-2
[1차] 캐시

입출력 예제
캐시크기(cacheSize)	도시이름(cities)	                                                                                                실행시간
3	                ["Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"]	                        50
3	                ["Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"]	                                21
2	                ["Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"]	60
5	                ["Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"]	52
2	                ["Jeju", "Pangyo", "NewYork", "newyork"]	                                                                        16
0	                ["Jeju", "Pangyo", "Seoul", "NewYork", "LA"]	                                                                    25

캐시 교체 알고리즘은 LRU를 사용한다.
cache hit = 실행시간 1
cache miss = 실행시간 5
 */

import java.util.ArrayList;
import java.util.List;

public class P17680 {
    public static void main(String[] args) {
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        System.out.println(solution(cacheSize, cities));
    }

    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;

        // 캐시 사이즈가 0이면 모두 cache miss
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        List<String> citiesList = new ArrayList<>();

        for (String city : cities) {
            String lowerCaseCity = city.toLowerCase();

            if (!citiesList.contains(lowerCaseCity)) {
                answer += 5;

                if (citiesList.size() >= cacheSize) {
                    citiesList.remove(0);
                }

                citiesList.add(lowerCaseCity);
            } else {
                citiesList.remove(lowerCaseCity);
                citiesList.add(lowerCaseCity);
                answer++;
            }

        }

        return answer;
    }
}