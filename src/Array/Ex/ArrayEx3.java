package Array.Ex;


import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요: ");
        for(int i = 0;i < num.length ;i++){
            num[i] = scanner.nextInt();
        }
        System.out.println("출력");
        for(int j = 4 ; j >= 0;j--){
            System.out.print(num[j]);
            if(j != 0){
                System.out.print(", ");
            }
        }
    }
}
