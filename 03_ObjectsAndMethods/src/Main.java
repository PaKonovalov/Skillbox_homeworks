public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 1);
        basket.add("Potato", 40, 1, 1.0);
        basket.add("Tomato", 60, 2, 0.5);
        basket.print("Корзина 1");

    }
}
