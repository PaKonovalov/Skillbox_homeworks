public class Basket {

    private static int count = 0; // переменная count для определения колличества одноименных товаров в корзине
    private String items = ""; // переменная items для добавления товров в корзину
    private int totalPrice = 0; // переменная totalPrice стоимости
    private int limit; // переменная limit для установки лимита корзины
    private double totalWeight = 0; // переменная totalWeight для подсчета итогового подсчета веса для развесных товаров

    public Basket() { // конструктор 1,
        increaseCount(1);
        items = "Список товаров:"; // при выполнении вывода
        this.limit = 1000000;

    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice, double totalWeight) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        add(name, price, 1, 0.0);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт., Стоимость - " + price + " руб., вес - " + weight;
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + weight * count;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
