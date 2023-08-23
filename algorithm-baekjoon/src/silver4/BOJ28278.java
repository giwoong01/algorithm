package silver4;

/*
스택 2

1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
3: 스택에 들어있는 정수의 개수를 출력한다.
4: 스택이 비어있으면 1, 아니면 0을 출력한다.
5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ28278 {
    private static int[] stack;
    private static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        stack = new int[n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            switch (str) {
                case "2":
                    sb.append(pop()).append("\n");
                    break;
                case "3":
                    sb.append(size()).append("\n");
                    break;
                case "4":
                    sb.append(empty()).append("\n");
                    break;
                case "5":
                    sb.append(top()).append("\n");
                    break;
                default:
                    String[] split = str.split(" ");
                    push(Integer.parseInt(split[1]));
                    break;
            }
        }

        System.out.println(sb);
    }

    public static void push(int x) {
        stack[size] = x;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int tmp = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return tmp;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int top() {
        if (size == 0) {
            return -1;
        } else {
            return stack[size - 1];
        }
    }
}
