public class Main {
    // если одинаковый набор тиов параметров
    public static void Fire(){
        System.out.println("Fire");
    }

    public static void main(String[] args) {

        Switcher switcher = new Switcher();
        Radio radio = new Radio();
        Lamp lamp = new Lamp();

        switcher.addElectricityListeners(radio);
        switcher.addElectricityListeners(lamp);
        // если необходимо использовать объект один разего можно реализовать через лямбда выражение,
        // при этом новый объект создается в лямбда выражении
        switcher.addElectricityListeners( ()-> System.out.println("Fire"));

        // если одинаковый набор тиов параметров public static void Fire() как и у electricityOn() интерфейса
        // можно записать лямда выражение следующим образом
        switcher.addElectricityListeners( Main::Fire);

        switcher.switchOn();
    }
}

