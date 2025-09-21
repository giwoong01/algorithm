package bronze2;

/*
다이얼
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int result = 0;
        for (char c : input.toCharArray()) {
            String cStr = String.valueOf(c);

            switch (cStr) {
                case "A":
                case "B":
                case "C":
                    result += 3;
                    break;
                case "D":
                case "E":
                case "F":
                    result += 4;
                    break;
                case "G":
                case "H":
                case "I":
                    result += 5;
                    break;
                case "J":
                case "K":
                case "L":
                    result += 6;
                    break;
                case "M":
                case "N":
                case "O":
                    result += 7;
                    break;
                case "P":
                case "Q":
                case "R":
                case "S":
                    result += 8;
                    break;
                case "T":
                case "U":
                case "V":
                    result += 9;
                    break;
                case "W":
                case "X":
                case "Y":
                case "Z":
                    result += 10;
                    break;
            }
        }

        System.out.println(result);
    }
}
