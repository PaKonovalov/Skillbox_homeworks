import core.*; // импорт класса (пакета) core в котором находятся классы Camera и Car, необходимы для генерации автомобилей и расчета стоимости в классе RoadController
import core.Camera; // импорт класса (пакета) Camera

import java.util.Scanner; // импорт класса Scanner для ввода количества автомобилей для генерации

public class RoadController { // объявление класса RoadController
    private static double passengerCarMaxWeight = 3500.0; // kg, объявлен тип переменной double.
    private static int passengerCarMaxHeight = 2000; // mm, объявлен тип переменной int
    private static int controllerMaxHeight = 3500; // mm, объявлен тип переменной int

    private static int passengerCarPrice = 100; // RUB, объявлен тип переменной int
    private static int cargoCarPrice = 250; // RUB, объявлен тип переменной int
    private static int vehicleAdditionalPrice = 200; // RUB, объявлентип переменной int

/* Если я правильно понял то переменные объявленные выше в классе RoadController до метода main
для того что бы их могли использовать классы Camera и Car.
Если мы их объявим в классе main то выходит, что классы Camera и Car их сипользовать не смогут?
Не совсем понятно почему модификатор доступа к данным переменным private, почему не public?
Серафим, поясни, пожалуйста.
 */

    public static void main(String[] args) { // объявление метода main
        System.out.println("Сколько автомобилей сгенерировать?"); // выдодим в консоль надпись "Сколько автомобилей сгенерировать?"

        Scanner scanner = new Scanner(System.in); // Инициализируем Scanner
        int carsCount = scanner.nextInt(); // объявлен тип переменной int. Присваиваем имя полученному из консоли значению

        for (int i = 0; i < carsCount; i++) {  // объявлен тип переменной int. Цикл for, i - точка отсчета,
                                               // цикл работает до достижения значения полученного из консоли
            Car car = Camera.getNextCar(); // тут выполняется расчет используя класс Car
            System.out.println(car); // тут выполняется вывод в консоль сгенерированных автомобилей (номер, высота, вес, прицеп, спецтранспорт)

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) { // если спецтранспорт, пропускаем его
                openWay(); // тут обращаемся к методу openWay() для открытия шлагбаума
                continue; // тут прекращаем цикл при спецтранспорте, далее начинаем заново
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            int price = calculatePrice(car);  // объявлен тип переменной int. Расчет стоимости для car из метода calculatePrice(Car car)
            if (price == -1) { // видимо какая-то проверка соимости... Объясни, пожалуйста.
                continue; // прекращаем цикл для сгененрированных авто не являющихся спецтранспортом
            }

            System.out.println("Общая сумма к оплате: " + price + " руб."); // выводим в консоль сумму к оплате
        }
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car car) { // объявление метода calculatePrice(Car car) для расчета стоимости в цикле for
        int carHeight = car.height;  // объявлен тип переменной int. Высота авто. не совсем понятно как работает
        int price = 0;  // объявлен тип переменной int, для нача отсчета стоимости
        if (carHeight > controllerMaxHeight) { // проверяем на максимальную высоту
            blockWay("высота вашего ТС превышает высоту пропускного пункта!"); // выводим в консоль "высота вашего ТС превышает высоту пропускного пункта!"
            // если высота больше 4000 мм
            return -1; // тут что-то возвращаем, не совсем понятно
        } else if (carHeight > passengerCarMaxHeight) { // проверяем высоту авто, если больше пассажирского то грузовой...
            double weight = car.weight; // объявлена переменная double. Вес авто. не совсем понятно как работает
            //Грузовой автомобиль
            if (weight > passengerCarMaxWeight) { // проверка на вес, если больше пассажирского авто то гузовой
                 price = cargoCarPrice; // тут видимо ошибка, должно быть price = cargoCarPrice;
                if (car.hasVehicle) { // проверка на наличие прицепа
                    price = price + vehicleAdditionalPrice; // расчет соимости проезда с прицепом
                }
            }
            //Легковой автомобиль
            else {
                price = passengerCarPrice; // тут пока не ясно. наверное если цена = цене грузового авто возвращаем цену за грузовой авто
            }
        } else {
            price = cargoCarPrice; // тут пока не ясно. наверное если цена = цене легкогвого авто возвращаем цену за леговой авто
        }
        return price; // возврящаем цену
    }

    /**
     * Открытие шлагбаума
     */
    private static void openWay() {
        System.out.println("Шлагбаум открывается... Счастливого пути!"); } // вывод в консоль "Шлагбаум открывается... Счастливого пути!" для спецтранспорта

    /**
     * Сообщение о невозможности проезда
     */
    private static void blockWay(String reason) {
        System.out.println("Проезд невозможен: " + reason); } // вывод в консоль "Проезд невозможен: " при превышении параметров авто
}