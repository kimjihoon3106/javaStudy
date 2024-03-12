package cond.Ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 3;
        String result = ( x % 2 == 0) ? "짝수 입니다." : "홀수 입니다.";
        System.out.println("result = " + result);
    }
}
