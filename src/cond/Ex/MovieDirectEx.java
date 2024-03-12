package cond.Ex;

public class MovieDirectEx {
    public static void main(String[] args) {
        int score = 7;

        if (score <= 7){
            System.out.println("'고질라'를 추천합니다.");
        }
        if ( score <= 8 ) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }

        if (score <= 10){
            System.out.println("'어바웃타임'을 추천합니다.");
        }


    }
}
