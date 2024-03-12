package operator.Ex;

public class OperationEx1 {
    public static void main(String[] args) {
        int num1 = 10,num2 = 20,num3 = 30;
        int sum = num1+num2+num3;

        System.out.println("result1 = " + sum);

        int average = sum /=3;

        System.out.println("average= " + average);
    }
}
