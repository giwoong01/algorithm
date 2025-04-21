package src.level2;

/*
level-2
스킬트리

입출력 예
skill	skill_trees	                        return
"CBD"	["BACDE", "CBADF", "AECB", "BDA"]	2
 */

import java.util.ArrayList;
import java.util.List;

public class P49993 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        System.out.println(solution(skill, skill_trees));
    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        List<List<Integer>> list = new ArrayList<>();

        for (String skillTree : skill_trees) {
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < skillTree.length(); i++) {
                char c = skillTree.charAt(i);

                if (skill.indexOf(c) != -1) {
                    l.add(skill.indexOf(c));
                }
            }

            list.add(l);
        }

        for (List<Integer> integers : list) {
            int index = 0;
            boolean isValid = true;
            for (Integer integer : integers) {
                if (integer != index) {
                    isValid = false;
                    continue;
                }

                index++;
            }

            if (isValid) {
                answer++;
            }
        }

        return answer;
    }

}
