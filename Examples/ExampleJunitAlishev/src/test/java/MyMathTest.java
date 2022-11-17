import org.junit.Test;

public class MyMathTest {

    @Test(expected = ArithmeticException.class)
    public void zeroDenominationShouldThrowException() {
        MyMath.divide(1, 0);
    }
}
