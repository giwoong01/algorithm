package src.level0;

/*
level-0
로그인 성공?

입출력 예
id_pw	                    db	                                                                            result
["meosseugi", "1234"]	    [["rardss", "123"], ["yyoom", "1234"], ["meosseugi", "1234"]]	                "login"
["programmer01", "15789"]	[["programmer02", "111111"], ["programmer00", "134"], ["programmer01", "1145"]]	"wrong pw"
["rabbit04", "98761"]	    [["jaja11", "98761"], ["krong0313", "29440"], ["rabbit00", "111333"]]	        "fail"
 */

public class P120883 {
    public static void main(String[] args) {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

        System.out.println(solution(id_pw, db));
    }

    public static String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];

        for (String[] strings : db) {
            if (id.equals(strings[0])) {
                if (pw.equals(strings[1])) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }

        return "fail";
    }
}
