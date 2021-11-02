class Arithmetic {
    int numOne;
    int numTwo;

    public Arithmetic(int numOne, int numTwo) {
        this.numOne = numOne;
        this.numTwo = numTwo;

        System.out.println("Сумма чисел равна: " + (numOne + numTwo));
        System.out.println("Произведение чисел ранвно: " + (numOne * numTwo));
        System.out.println("Максимальное из двух чисел: " + (Math.max(numOne, numTwo)));
        System.out.println("Минимальное из двух чисел: " + (Math.min(numOne, numTwo)));
    }
        public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(47, 35);
        }
}