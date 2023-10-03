public class Calculator {

    double summ;
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
        this.summ = sum(a, b);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

}
