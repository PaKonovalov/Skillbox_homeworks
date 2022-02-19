public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator operation = new ArithmeticCalculator(1,2, Operation.ADD);
        operation.getCalculate();
        System.out.println(operation.getCalculate());
    }
}
