package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doublevalue = 1.5;
        int intvalue = 0;

        intvalue = (int) doublevalue;
        System.out.println("intvalue = " + intvalue);

        int z = (int) doublevalue;
        System.out.println("z = " + z);
        System.out.println("doublevalue = " + doublevalue);


    }
}
