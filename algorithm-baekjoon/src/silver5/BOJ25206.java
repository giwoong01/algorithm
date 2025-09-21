package silver5;

/*
너의 평점은
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double result = 0;
        double creditAll = 0;
        for (int i = 0; i < 20; i++) {
            String input = br.readLine();
            String[] split = input.split(" ");

            double credit = Double.parseDouble(split[1]);
            String grade = split[2];

            double gradeInt = 0;
            switch (grade) {
                case "A+":
                    gradeInt = 4.5;
                    break;
                case "A0":
                    gradeInt = 4.0;
                    break;
                case "B+":
                    gradeInt = 3.5;
                    break;
                case "B0":
                    gradeInt = 3.0;
                    break;
                case "C+":
                    gradeInt = 2.5;
                    break;
                case "C0":
                    gradeInt = 2.0;
                    break;
                case "D+":
                    gradeInt = 1.5;
                    break;
                case "D0":
                    gradeInt = 1.0;
                    break;
                case "P":
                    credit = 0;
                    break;
            }

            creditAll += credit;
            result += credit * gradeInt;
        }

        System.out.println(result / creditAll);
    }
}
