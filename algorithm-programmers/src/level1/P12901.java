package src.level1;

// level-1
// 2016년

// 입출력 예
// a	b	result
// 5	24	"TUE"

import java.time.LocalDate;

public class P12901 {
    public String solution(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3);
    }
}