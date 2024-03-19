package scanner.Ex;

import java.util.Scanner;

public class ScannerEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int firstnum = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 : ");
        int secondnum = scanner.nextInt();

        int more = (firstnum > secondnum) ? firstnum : secondnum;
        int less = (firstnum < secondnum) ? firstnum : secondnum;

        System.out.print("두 숫자 사이에 모든 정수 : ");
        for(int i = less ; i<=more ; i++){
            System.out.print(i);
            if (i != more){
                System.out.print(",");
            }
        }
    }
}
