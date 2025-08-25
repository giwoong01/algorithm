package src.level0;

/*
level-0
[PCCE 기출문제] 7번 / 버스

입출력 예
seat	passengers	                                                result
5	    [["On", "On", "On"], ["Off", "On", "-"], ["Off", "-", "-"]]	3
10	    [["On", "On", "On", "On", "On", "On", "On", "On", "-", "-"], ["On", "On", "Off", "Off", "Off", "On", "On", "-", "-", "-"], ["On", "On", "On", "Off", "On", "On", "On", "Off", "Off", "Off"], ["On", "On", "Off", "-", "-", "-", "-", "-", "-", "-"]]	0
 */

public class P340201 {
    public static void main(String[] args) {
        int seat = 5;
        String[][] passengers = {{"On", "On", "On"}, {"Off", "On", "-"}, {"Off", "-", "-"}};

        System.out.println(solution(seat, passengers));
    }

    public static int solution(int seat, String[][] passengers) {
        int num_passenger = 0;
        for(int i=0; i<passengers.length; i++){
            num_passenger += func4(passengers[i]);
            num_passenger -= func3(passengers[i])
            ;
        }
        int answer = func1(seat - num_passenger);
        return answer;
    }

    public static int func1(int num){
        if(0 > num){
            return 0;
        }
        else{
            return num;
        }
    }
    public static int func2(int num){
        if(num > 0){
            return 0;
        }
        else{
            return num;
        }
    }

    public static int func3(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("Off")){
                num += 1;
            }
        }
        return num;
    }

    public static int func4(String[] station){
        int num = 0;
        for(int i=0; i<station.length; i++){
            if(station[i].equals("On")){
                num += 1;
            }
        }
        return num;
    }
}
