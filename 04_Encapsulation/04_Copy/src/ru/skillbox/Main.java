package ru.skillbox;
public class Main {
    public static void main(String[] args) {
        var cargoData = new CargoData();
        cargoData = cargoData.setWeight(13.5);
        cargoData = cargoData.setDeliveryAddress("Москва, Ленинский проспект, дом 6, строение 20");
        cargoData = cargoData.setRegistrationNumber("21312YUG");

        var dimensions = new Dimensions();
        dimensions = dimensions.setHeight(0.3);
        dimensions = dimensions.setLength(0.6);
        dimensions = dimensions.setWidth(8);

        System.out.println(cargoData);
        System.out.println(dimensions);
    }
}
