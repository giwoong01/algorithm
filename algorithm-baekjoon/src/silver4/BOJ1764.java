package silver4;

/*
듣보잡

입력
첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다.
이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.
듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.

출력
듣보잡의 수와 그 명단을 사전순으로 출력한다.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < N + M; i++) {
            String key = br.readLine();
            hm.put(key, hm.getOrDefault(key, 0) + 1);

        }

        int count = 0;
        List<String> list = new ArrayList<>();
        for (String s : hm.keySet()) {
            if (hm.get(s) == 2) {
                count++;
                list.add(s);
            }
        }

        Collections.sort(list);

        System.out.println(count);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
