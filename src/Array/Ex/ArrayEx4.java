package Array.Ex;


import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int total = 0;
        double avg;

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int term = scanner.nextInt();

        int[] num = new int[term];

        System.out.println(term + "개의 정수를 입력하세요: ");
        for(int i = 0;i < term ;i++){
            num[i] = scanner.nextInt();
            total += num[i];
        }
        avg = (double) total / term;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
