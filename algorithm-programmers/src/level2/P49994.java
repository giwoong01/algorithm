package src.level2;

/*
level-2
방문 길이

입출력 예
dirs	     answer
"ULURRDLLU"	7
"LULLLLLLU"	7
 */

import java.util.HashSet;
import java.util.Set;

public class P49994 {

    public static void main(String[] args) {
        String dirs = "ULURRDLLU";

        System.out.println(solution(dirs));
    }

    public static int solution(String dirs) {
        int x = 0;
        int y = 0;

        Set<String> exitsRoads = new HashSet<>();

        char[] charArray = dirs.toCharArray();
        for (char c : charArray) {
            int nextX = x;
            int nextY = y;
            String moving = "";

            switch (String.valueOf(c)) {
                case "U" -> {
                    nextY += 1;
                    moving = "" + x + y + "->" + nextX + nextY;
                }
                case "D" -> {
                    nextY -= 1;
                    moving = "" + nextX + nextY + "->" + x + y;
                }
                case "R" -> {
                    nextX += 1;
                    moving = "" + x + y + "->" + nextX + nextY;
                }
                case "L" -> {
                    nextX -= 1;
                    moving = "" + nextX + nextY + "->" + x + y;
                }
            }

            if (nextX > 5 || nextX < -5 || nextY > 5 || nextY < -5) {
                continue;
            }

            exitsRoads.add(moving);

            x = nextX;
            y = nextY;
        }

        return exitsRoads.size();
    }
}
