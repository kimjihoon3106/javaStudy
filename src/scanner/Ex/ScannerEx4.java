package scanner.Ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력하세요 : ");
        int gogodanso = scanner.nextInt();

        for(int i = 1;i<10;i++){
            System.out.println(gogodanso + " * " + i + " = " + gogodanso * i);
        }
    }
}
