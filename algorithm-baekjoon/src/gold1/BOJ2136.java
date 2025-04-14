package gold1;

/*
개미
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2136 {
    static class Ant implements Comparable<Ant> {
        int i;
        int abs;

        public Ant(int i, int abs) {
            this.i = i;
            this.abs = abs;
        }

        @Override
        public int compareTo(Ant a) {
            return this.abs - a.abs;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        int N = Integer.parseInt(split[0]);
        int L = Integer.parseInt(split[1]);

        int[] arr = new int[N];
        boolean[] isPositive = new boolean[N];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > 0) {
                isPositive[i] = true;
            }

            arr[i] = Math.abs(num);
        }

        Ant[] ants = new Ant[N];
        int positiveMax = 0;
        int negativeMax = 0;
        for (int i = 0; i < arr.length; i++) {
            ants[i] = new Ant(i + 1, Math.abs(arr[i]));

            if (isPositive[i]) {
                positiveMax = Math.max(positiveMax, L - arr[i]);
            } else {
                negativeMax = Math.max(negativeMax, arr[i]);
            }
        }
        Arrays.sort(ants);

        int negativeCount = 0;
        for (boolean b : isPositive) {
            if (!b) {
                negativeCount++;
            }
        }

        if (positiveMax > negativeMax) {
            System.out.printf("%d %d", ants[negativeCount].i, positiveMax);
        } else {
            System.out.printf("%d %d", ants[negativeCount - 1].i, negativeMax);
        }
    }
}

