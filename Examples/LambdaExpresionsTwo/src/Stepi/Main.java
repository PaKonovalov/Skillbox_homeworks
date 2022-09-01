package Stepi;

public class Main {
    public static void main(String[] args) {
        double a = -10.12;
        double res = Math.sqrt(a);
        if (a > 0) {
            System.out.println(res);
        } else {
            throw new IllegalArgumentException("Expected non-negative number, got " + a);
        }

    }

    public static double sqrt(double x) {
            if (x < 0){
                throw new IllegalArgumentException("Expected non-negative number, got" + x);
            }
            return Math.sqrt(x); // your implementation here
    }
}

