public class Main {

    public static void main(String[] args) {
        var basketIvan = new Basket();
        basketIvan.add("Milk", 40, 1);
        basketIvan.add("Potato", 40, 1, 1.0);
        var bascketSofia = new Basket();
        bascketSofia.add("Tomato", 60, 2, 0.5);
        NewBaskets basketJhon = new NewBaskets();
        bascketSofia.print("Корзина Ивана");
        basketIvan.print("Корзина Софии");
        System.out.println("Средняя стоимость корзины: " + Basket.getAveragePriceBasket());
        System.out.println("Средняя цена товаров во всех корзинах: " + Basket.getAverageCostBasket());

    }
}
