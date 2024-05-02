package bronze3;

import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M >= 45 && M < 60) {
            M -= 45;
        } else if (M < 45 && M >= 0) {
            int a = 60 - 45;
            M += a;

            H -= 1;
            if (H < 0) {
                H = 23;
            }

        }

        System.out.println(H + " " + M);
        sc.close();
    }
}
