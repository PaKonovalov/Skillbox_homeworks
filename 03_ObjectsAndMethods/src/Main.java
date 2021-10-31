public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 1);
        basket.add("Potato", 40, 2, 3.5);
        basket.print("Корзина 1");
    }
}
