package src.level1;

/*
level-1
[PCCE 기출문제] 5번 / 심폐소생술

빈칸 채우기는 이미 완성된 코드 중 빈칸에 알맞은 코드를 입력하는 문제 타입입니다.
빈칸을 제외한 기본 코드는 수정할 수 없습니다.
빈칸을 채우지 않을 경우, 실행 결과에 에러 메시지가 표시됩니다.
 */

public class P340203 {
    public int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for(int i=0; i<
                cpr.length
                ; i++){
            for(int j=0; j<
                    basic_order.length
                    ; j++){
                if(cpr[i].equals(basic_order[j])){
                    answer[i] =
                            j + 1
                    ;
                    break;
                }
            }
        }
        return answer;
    }
}
