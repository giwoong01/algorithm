package src.level1;

// level-1
// 문자열 내 p와 y의 개수

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        int pCnt = 0, yCnt = 0;
        String[] array = s.toLowerCase().split("");

        for (int i = 0; i < s.length(); i++) {
            if ("p".equals(array[i])) {
                pCnt++;
            } else if ("y".equals(array[i])) {
                yCnt++;
            }
        }
        if (pCnt != yCnt) {
            return false;
        }
        return true;
    }
}
