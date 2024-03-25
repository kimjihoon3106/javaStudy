package Array.Ex;


import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        int most = -999;
        int less = 999;

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

        for(int i = 0 ; i<term ; i++){
            if(num[i] > most){
                most = num[i];
            }
        }
        for(int i = 0 ; i<term ; i++){
            if(num[i] < less){
                less = num[i];
            }
        }

        System.out.println("가장 작은 정수: "+less);
        System.out.println("가장 큰 정수: "+most);
    }
}
