public class Basket {

    public static double totalPriceBaskets;
    public static int totalItemsBaskets;
    public static double averagePriceBasket;
    public static double averageCostBasket;
    private static int count;
    private String items;
    private int totalPrice;
    private int limit;
    private double totalWeight;

    public Basket() {
        count++;
        items = "Список товаров:";
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

    public static double getTotalPriceBaskets() {
        return totalPriceBaskets;
    }

    public static int getTotalItemsBaskets() {
        return totalItemsBaskets;
    }


    public static double getAveragePriceBasket() {
        return averagePriceBasket;
    }

    public static double getAverageCostBasket() {
        return averageCostBasket;
    }


    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        add(name, price, 1, 0);
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
                count + " шт., стоимость - " + price + " руб., вес - " + weight;
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + weight * count;
        totalPriceBaskets = totalPriceBaskets + totalPrice;
        totalItemsBaskets = totalItemsBaskets + count;
        averagePriceBasket = totalPriceBaskets / count;
        averageCostBasket = totalPriceBaskets / totalItemsBaskets;
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
        System.out.println("Общий вес весовых товаров: " + getTotalWeight() + " кг.");
    }
}
