package gold4;

/*
문자열 폭발
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ9935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String explosionString = br.readLine();
        int explosionStringSize = explosionString.length();
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);

            if (stack.size() >= explosionStringSize) {
                boolean flag = true;

                for (int i = 0; i < explosionStringSize; i++) {
                    if (stack.get(stack.size() - explosionStringSize + i) != explosionString.charAt(i)) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    for (int i = 0; i < explosionStringSize; i++) {
                        stack.pop();
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : stack) {
            sb.append(c);
        }

        System.out.println(sb.length() == 0 ? "FRULA" : sb);
    }
}
