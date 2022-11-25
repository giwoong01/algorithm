package silver5;

// 셀프 넘버
// 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

public class BOJ4673 {
    public static void main(String[] args) {
        boolean[] a = new boolean[10001];

        for(int i = 1; i < 10001; i++){
            int n = d(i);
            if(n < 10001){
                a[n] = true;
            }
        }
        for(int i = 1; i < 10001; i++){
            if(a[i] == false){
                System.out.println(i);
            }
        }
    
    }

    public static int d(int number){
        int sum = number;
        while(number != 0 ){
            sum += number%10;
            number = number/10;
        }
        return sum;
    }
}
