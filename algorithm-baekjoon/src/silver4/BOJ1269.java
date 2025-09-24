package silver4;

/*
대칭 차집합
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aSize = Integer.parseInt(st.nextToken());
        int bSize = Integer.parseInt(st.nextToken());

        Set<Integer> A = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aSize; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> B = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bSize; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        for (int num : A) {
            if (!B.contains(num)) {
                count++;
            }
        }

        for (int num : B) {
            if (!A.contains(num)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
