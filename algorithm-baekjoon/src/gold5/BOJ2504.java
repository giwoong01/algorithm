package gold5;

/*
괄호의 값
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        if (str.length() % 2 == 1) {
            System.out.println(0);
            return;
        }

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));

            if (s.equals("(") || s.equals("[")) {
                stack.push(s);
            } else {
                if (stack.isEmpty()) {
                    System.out.println(0);
                    return;
                }

                int value = 0;
                while (!stack.isEmpty() && !stack.peek().equals("(") && !stack.peek().equals("[")) { // 숫자가 연속으로 들어있는 경우, 누적해서 합산
                    value += Integer.parseInt(stack.pop());
                }

                if (stack.isEmpty()) {
                    System.out.println(0);
                    return;
                }

                String pop = stack.pop();
                if ((s.equals(")") && !pop.equals("(")) || (s.equals("]") && !pop.equals("["))) {
                    System.out.println(0);
                    return;
                }

                if (value == 0) {  // 누적합산이 0이면 기본값 1 -> 곱해도 2 or 3 유지
                    value = 1;
                }

                if (s.equals(")")) { // 닫는 괄호가 오면 곱하기
                    stack.push(String.valueOf(value * 2));
                } else {
                    stack.push(String.valueOf(value * 3));
                }

                if (!stack.isEmpty() && !stack.peek().equals("(") && !stack.peek().equals("[")) { // 스택의 마지막 원소가 숫자일때
                    String num1 = stack.pop();

                    if (stack.size() >= 2 && !stack.peek().equals("(") && !stack.peek().equals("[")) { // 스택의 마지막에서 두번째 원소가 숫자일때
                        String num2 = stack.pop();

                        stack.push(String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2))); // 연속된 숫자는 더해주기
                        continue;
                    }

                    stack.push(num1);
                }

            }

        }

        int result = 0;
        while (!stack.isEmpty()) {
            String pop = stack.pop();
            if (pop.equals("(") || pop.equals("[")) {
                System.out.println(0);
                return;
            }
            result += Integer.parseInt(pop);
        }

        System.out.println(result);
    }
}
