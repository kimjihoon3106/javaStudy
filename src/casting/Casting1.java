package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intvalue =10;
        long longvalue;
        double dobulevalue;
        
        longvalue = intvalue;
        System.out.println("longvalue = " + longvalue);

        dobulevalue = intvalue;
        System.out.println("dobulevalue = " + dobulevalue);

        dobulevalue = 20l;
        System.out.println("dobulevalue2 = " + dobulevalue);
    }
}
