class ArithmeticCalculator {
    public int x;
    public int y;
    public Operation type;

    public ArithmeticCalculator(int x, int y, Operation type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public int getCalculate() {
        return calculate();
    }
// При создании проекта необходимо следить за версией JDK ранее не работало с лямбда т.к. была неверная версия.
    public int calculate() {
        return switch (type) {
            case MULTIPLY -> x * y;
            case ADD -> x + y;
            case SUBTRACT -> x - y;
        };

//        Через if
//        if (type == Operation.MULTIPLY) {
//            return x * y;
//        }
//        if (type == Operation.ADD) {
//            return x + y;
//        }
//        if (type == Operation.SUBTRACT) {
//            return x - y;
//        }
//        return 0;
    }
}
