package gold5;

/*
탑
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] topArr = br.readLine().split(" ");

        Stack<Top> stack = new Stack<>();
        Stack<Integer> result = new Stack<>();

        Top firstTop = new Top(1, Integer.parseInt(topArr[0]));
        stack.push(firstTop);
        result.push(0);
        for (int i = 2; i <= N; i++) {
            Top curTop = new Top(i, Integer.parseInt(topArr[i - 1]));

            while (!stack.isEmpty() && stack.peek().height < curTop.height) { // 현재 탑의 높이가 더 크면 stack에서 제거
                stack.pop();
            }

            if (stack.isEmpty()) {
                result.push(0);
            } else {
                result.push(stack.peek().index);
            }

            stack.push(curTop);
        }

        StringBuilder sb = new StringBuilder();
        for (Integer i : result) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }

    static class Top {
        int index;
        int height;

        public Top(int index, int height) {
            this.index = index;
            this.height = height;
        }
    }

}