public class Main {
    public static void main(String[] args) {
       System.out.println("Система расчета стоимости топлива");
       int fuelType = 95, amount = 420, maxAmount = 400;
       double fuel92price = 60.2, fuel95price = 67.33, fuelPrice = 0;
            if (fuelType == 92) {
                fuelPrice = fuel92price;
      }
           else if (fuelType == 95) {
               fuelPrice = fuel95price;
        } else {
                System.out.println("Неверный тип топлива");
                if (amount < 1)
                    System.out.println("Указано малое колличество топлива");
                amount = 0;
            }
            if (amount > maxAmount) {
                System.out.println("Указанное количество топлива превышает максимально допустимое");
            }
        System.out.println("Цена выбранного топлива: " + fuelPrice +" руб.");
            double totalPrice = fuelPrice * amount;
       System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");
    }
}
