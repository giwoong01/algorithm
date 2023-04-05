package src.level1;

// level-1
// 추억 점수

// 입출력 예
// name	            yearning	     photo	                            result
// ["may", "kein",  [5, 10, 1, 3]   [["may", "kein", "kain", "radi"],  [19, 15, 6]
// "kain", "radi"]		            ["may", "kein", "brin", "deny"],
//                                  ["kon", "kain", "may", "coni"]]

public class P176963 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                for (int k = 0; k < name.length; k++) {
                    if (name[k].equals(photo[i][j])) {
                        answer[i] += yearning[k];
                    }
                }
            }
        }

        return answer;
    }
}
