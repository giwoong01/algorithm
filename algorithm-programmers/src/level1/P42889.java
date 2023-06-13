package src.level1;

// level-1
// 실패율

// 입출력 예
// N	stages	                    result
// 5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
// 4	[4,4,4,4,4]	                [4,1,2,3]

import java.util.*;

public class P42889 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        System.out.println(Arrays.toString(solution(N, stages)));
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Double> hm = new HashMap<>();
        int humanCount = stages.length;
        int noClear = 0;

        for (int i = 1; i <= N; i++) {
            for (int s : stages) {
                if (s == i) noClear++;
            }
            if (humanCount == 0) hm.put(i, 0.0);
            else {
                hm.put(i, (double) noClear / humanCount);
                humanCount -= noClear;
                noClear = 0;
            }
        }

        List<Map.Entry<Integer, Double>> list = new ArrayList<>(hm.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, Double>>() {
            public int compare(Map.Entry<Integer, Double> obj1, Map.Entry<Integer, Double> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });

        int c = 0;
        for (Map.Entry<Integer, Double> entry : list) {
            answer[c] = entry.getKey();
            c++;
        }
        return answer;
    }
}
