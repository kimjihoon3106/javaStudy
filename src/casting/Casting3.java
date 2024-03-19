package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxintvlaue = 2147483647;
        long maxintover = 2147483648L; //int 초고값 +1(초과)
        int intvalue =0;
        int intover =0;

        intvalue =(int) maxintvlaue;
        System.out.println("maxintvalue casting = " + intvalue);

        intover = (int) 2147483648L;
        System.out.println("maxintover = " + intover);

    }
}
