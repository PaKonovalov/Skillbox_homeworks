package ru.skillbox;
public class Main {
    public static void main(String[] args) {
        CargoData cargoData = new CargoData();
        cargoData.setWeight(13.5);
        cargoData.setDeliveryAddress("Москва, Ленинский проспект, дом 6, строение 20");
        cargoData.setThisSideUp("YES");
        cargoData.setRegistrationNumber("21312YUG");
        cargoData.setFragile("YES");

        Dimensions dimensions = new Dimensions();
        dimensions.setHeight(24.3);
        dimensions.setLength(22.6);
        dimensions.setWidth(11);


        CargoData copyCargoData = new CargoData(cargoData.getWeight(), cargoData.getDeliveryAddress(),
                  cargoData.getThisSideUp(), cargoData.getRegistrationNumber(), cargoData.getFragile());
        copyCargoData.setWeight(13.5);
        copyCargoData.setDeliveryAddress("Москва, Ленинский проспект, дом 6, строение 20");
        copyCargoData.setThisSideUp("YES");
        copyCargoData.setRegistrationNumber("21312YUG");
        copyCargoData.setFragile("YES");

        Dimensions copyDimensions = new Dimensions(dimensions.getHeight(), dimensions.getLength(), dimensions.getWidth());
        copyDimensions.setHeight(24.3);
        copyDimensions.setLength(22.6);
        copyDimensions.setWidth(11);

        System.out.println(copyCargoData);
        System.out.println(cargoData);
        System.out.println(copyDimensions);
    }

}
