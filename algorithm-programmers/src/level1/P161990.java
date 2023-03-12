package src.level1;

// level-1
// 바탕화면 정리

// 입출력 예
// wallpaper	                                                                                result
// [".#...", "..#..", "...#."]	                                                                [0, 1, 3, 4]
// ["..........", ".....#....", "......##..", "...##.....", "....#....."]	                    [1, 3, 5, 8]
// [".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."]	[0, 0, 7, 9]
// ["..", "#."]	                                                                                [1, 0, 2, 1]

public class P161990 {
    public int[] solution(String[] wallpaper) {
        int lux = 51;
        int luy = 51;
        int drx = 0;
        int dry = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            String str = wallpaper[i];
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (str.charAt(j) == '#') {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    drx = Math.max(drx, i + 1);
                    dry = Math.max(dry, j + 1);
                }
            }
        }

        return new int[]{lux, luy, drx, dry};
    }
}
