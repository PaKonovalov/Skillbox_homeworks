package ru.skillbox;
public class CargoData {
    private final double weight;
    private final String deliveryAddress;
    private final String thisSideUp;
    private final String registrationNumber;
    private final String fragile;

    public CargoData(double weight, String deliveryAddress, String thisSideUp, String registrationNumber, String fragile) {
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.thisSideUp = thisSideUp;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }

    public CargoData() {
        weight = 0;
        deliveryAddress = "N/A";
        thisSideUp = "NO";
        registrationNumber = "N/A";
        fragile = "NO";
    }

    public double getWeight() {
        return weight;
    }

    public CargoData setWeight(double weight) {
       return new CargoData(weight, deliveryAddress, thisSideUp, registrationNumber, fragile);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public CargoData setDeliveryAddress(String deliveryAddress) {
        return new CargoData (weight, deliveryAddress, thisSideUp, registrationNumber, fragile);
    }

    public String getThisSideUp() {
        return thisSideUp;
    }

    public CargoData setThisSideUp(String thisSideUp) {
        return new CargoData (weight, deliveryAddress, thisSideUp, registrationNumber, fragile);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public CargoData setRegistrationNumber(String registrationNumber) {
        return new CargoData(weight, deliveryAddress, thisSideUp, registrationNumber, fragile);
    }

    public String getFragile() {
        return fragile;
    }

    public CargoData setFragile(String fragile) {
        return new CargoData(weight, deliveryAddress, thisSideUp, registrationNumber, fragile);
    }

    public String toString() {
        return "Вес: " + weight + "\n" +
                "Адрес доставки: " + deliveryAddress + "\n" +
                "Можно ли переворачивать: " + thisSideUp + "\n" +
                "Регистрационный номер: " + registrationNumber + "\n" +
                "Является ли груз хрупким: " + fragile;
    }
}
