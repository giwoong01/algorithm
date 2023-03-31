package src.level1;

// level-1
// 공원 산책

// park	                        routes	                result
// ["SOO","OOO","OOO"]	        ["E 2","S 2","W 1"]	    [2,1]
// ["SOO","OXX","OOO"]	        ["E 2","S 2","W 1"]	    [0,1]
// ["OSO","OOO","OXO","OOO"]	["E 2","S 3","W 1"]	    [0,0]

// answer[0] -> 세로방향
// answer[1] -> 가로방향
//   0 1 2 -> index
// 0 S O O
// 1 O O O
// 2 O O O

//   0 1 2
// 0 S O O
// 1 O X X
// 2 O O O

public class P172928 {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        // 시작 지점 좌표판단
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    answer[0] += i; // 세로
                    answer[1] += j; // 가로
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            String route = routes[i];
            int n = route.charAt(2) - '0'; // 이동거리

            if (route.charAt(0) == 'N') { // 북
                if (answer[0] - n < 0) { // 이동할 때 벗어나는지 확인
                    continue;
                }
                boolean block = false;
                for (int j = 1; j <= n; j++) {
                    if (park[answer[0] - j].charAt(answer[1]) == 'X') { // 현재 위치에서 북쪽 확인
                        block = true;
                        break;
                    }
                }
                if (block) {
                    continue;
                }
                answer[0] -= n;
            } else if (route.charAt(0) == 'S') { // 남
                if (answer[0] + n > park.length - 1) { // 이동할 때 벗어나는지 확인
                    continue;
                }
                boolean block = false;
                for (int j = 1; j <= n; j++) {
                    if (park[answer[0] + j].charAt(answer[1]) == 'X') { // 현재 위치에서 남쪽 확인
                        block = true;
                        break;
                    }
                }
                if (block) {
                    continue;
                }
                answer[0] += n;
            } else if (route.charAt(0) == 'W') { // 서
                if (answer[1] - n < 0) { // 이동할 때 벗어나는지 확인
                    continue;
                }
                boolean block = false;
                for (int j = 1; j <= n; j++) {
                    if (park[answer[0]].charAt(answer[1] - j) == 'X') { // 현재 위치에서 서쪽 학윈
                        block = true;
                        break;
                    }
                }
                if (block) {
                    continue;
                }
                answer[1] -= n;
            } else if (route.charAt(0) == 'E') { // 동
                if (answer[1] + n > park[0].length() - 1) { // 이동할 때 벗어나는지 확인
                    continue;
                }
                boolean block = false;
                for (int j = 1; j <= n; j++) {
                    if (park[answer[0]].charAt(answer[1] + j) == 'X') { // 현재 위치에서 동쪽 확인
                        block = true;
                        break;
                    }
                }
                if (block) {
                    continue;
                }
                answer[1] += n;
            }
        }

        return answer;
    }
}
