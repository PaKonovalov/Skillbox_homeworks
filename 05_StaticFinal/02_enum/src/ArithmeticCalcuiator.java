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

    public int calculate() {
        /// TODO: 19.02.2022 реализовать возможность возврата значений используя лямбда 
//        return switch (type) {
//            case MULTIPLY -> x * y;
//            case ADD -> x + y;
//            case SUBTRACT -> x - y;
//        };

        if (type == Operation.MULTIPLY) {
            return x * y;
        }
        if (type == Operation.ADD) {
            return x + y;
        }
        if (type == Operation.SUBTRACT) {
            return x - y;
        }
        return 0;
    }
}
