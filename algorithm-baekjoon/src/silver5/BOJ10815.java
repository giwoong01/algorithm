package silver5;

// 숫자카드
// 첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.
// 두 숫자 카드에 같은 수가 적혀있는 경우는 없다.
// 셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 넷째 줄에는 상근이가 가지고 있는 숫자 카드인지 아닌지를 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다.
// 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다
// 첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 아니면 0을 공백으로 구분해 출력한다.
// 이분탐색으로 구하면 빠르다


import java.util.Arrays;
import java.util.Scanner;

public class BOJ10815 {
    static int n, m;
    static int card[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        card = new int[n];
        for (int i = 0; i < n; i++) {
            card[i] = sc.nextInt();
        }
        Arrays.sort(card);

        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            if (binarySearch(num)) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
        sc.close();
    }

    private static boolean binarySearch(int num) {
        int leftIndex = 0;
        int rightIndex = n - 1;

        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            int mid = card[midIndex];

            if (num < mid) rightIndex = midIndex - 1;
            else if (num > mid) leftIndex = midIndex + 1;
            else return true;
        }
        return false;
    }
}