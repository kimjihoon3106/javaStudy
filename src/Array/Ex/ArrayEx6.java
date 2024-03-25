package Array.Ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        int term = scanner.nextInt();
        int[][] student = new int[term][3];
        int[] total =  new int[term];

        for(int i = 0 ;i < student.length; i++){
            System.out.println((i+1)+"번 학생의 성적을 입력하세요: ");
            for(int j = 0; j < student[i].length; j++){
                if(j == 0){
                    System.out.print("국어 점수: ");
                    student[i][j] = scanner.nextInt();
                    total[i] += student[i][j];
                }
                if(j == 1){
                    System.out.print("영어 점수: ");
                    student[i][j] = scanner.nextInt();
                    total[i] += student[i][j];
                }
                if( j == 2 ){
                    System.out.print("수학 점수: ");
                    student[i][j] = scanner.nextInt();
                    total[i] += student[i][j];
                }
            }
        }
        for(int i = 0 ; i < student.length; i++){
            double avg = (double) total[i] / student[i].length;
            System.out.println((i+1) + "번 학생의 총점: "+ total[i] +", 평균: "+avg);
        }
    }
}
