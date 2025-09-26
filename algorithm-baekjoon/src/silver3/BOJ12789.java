package silver3;

/*
도키도키 간식드리미
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ12789 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        String[] split = br.readLine().split(" ");
        int index = 1;
        String result = "Nice";

        for (int i = 0; i < N; i++) {
            int currentNum = Integer.parseInt(split[i]);

            if (index != currentNum) {
                if (!stack.isEmpty() && index == stack.peek()) {
                    index++;
                    i--;
                    stack.pop();
                } else {
                    stack.push(currentNum);
                }
            } else {
                index++;
            }
        }

        while (!stack.isEmpty()) {
            int pop = stack.pop();

            if (pop == index) {
                index++;
            } else {
                result = "Sad";
                break;
            }
        }

        System.out.println(result);
    }
}
