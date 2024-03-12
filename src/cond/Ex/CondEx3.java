package cond.Ex;

public class CondEx3 {
    public static void main(String[] args) {
        int dollor = 10;
        int result = dollor * 1300;

        if(dollor<0){
            System.out.println("잘못된 금액입니다");
        }
        if(dollor==0){
            System.out.println("환전할 금액이 없습니다");
        }
        if(dollor>0){
            System.out.println("계산된 원화 금액은 " + result +"원 입니다.");
        }
    }
}
