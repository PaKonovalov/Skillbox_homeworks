public class ArithmeticCalculator {
    public int x;
    public int y;
    public Operation type;

    public ArithmeticCalculator() {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void Calculate(int x, int y, Operation type) {
        switch (type) {
        case MULTIPLY :
           System.out.println("MULTIPLY result is: " + (x * y));
           break;
        case ADD :
            System.out.println("ADD result is: " + (x + y));
            break;
        case SUBTRACT :
            System.out.println("ADD result is: " + (x - y));
            break;
        }
    }
}
