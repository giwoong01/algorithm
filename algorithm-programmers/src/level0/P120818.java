package src.level0;

/*
level-0
옷가게 할인 받기

입출력 예
price	result
150,000	142,500
580,000	464,000
 */

public class P120818 {
    public static void main(String[] args) {
        int price = 580000;

        System.out.println(solution(price));
    }

    public static int solution(int price) {
        if (price >= 500000) {
            price *= 0.8;
        } else if (price >= 300000) {
            price *= 0.9;
        } else if (price >= 100000) {
            price *= 0.95;
        }

        return price;
    }
}
