package scanner.Ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numall = 0;
        int count = 0;
        int num;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
//        while(true){
//
//            int num = scanner.nextInt();
//            if(num == -1){
//                break;
//            }
//            numall = num + numall;
//            ++count;
//        }
        while((num = scanner.nextInt()) != -1 ){
            numall += num;
            count++;
        }
        double avg = (double) numall / count;

        System.out.println("입력한 숫자들의 합계: "+ numall);
        System.out.println("입력한 숫자들의 평군: "+ avg);
    }
}
