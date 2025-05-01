package silver2;

/*
로또
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ6603 {
    private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            String[] split = input.split(" ");

            int k = Integer.parseInt(split[0]);

            if (k == 0) {
                break;
            }

            int[] s = new int[k];
            for (int i = 0; i < k; i++) {
                s[i] = Integer.parseInt(split[i + 1]);
            }

            sb = new StringBuilder();

            DFS(s, 0, new ArrayList<>(), 6);

            System.out.println(sb);
        }
    }

    private static void DFS(int[] s, int index, List<Integer> selected, int r) {
        if (selected.size() == r) {
            for (Integer i : selected) {
                sb.append(i).append(" ");
            }

            sb.append("\n");
            return;
        }

        if (selected.size() + s.length - index < r) {
            return;
        }

        selected.add(s[index]);
        DFS(s, index + 1, selected, r);
        selected.remove(selected.size() - 1);
        DFS(s, index + 1, selected, r);
    }
}