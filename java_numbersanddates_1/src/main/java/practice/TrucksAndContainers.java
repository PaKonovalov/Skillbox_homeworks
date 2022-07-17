package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    public static void main(String[] args) {
        int container = 1;
        int truck = 1;
        int boxInCont = 27;
        int contInTruck = 12;
        double boxes = (new Scanner(System.in)).nextInt();

        if (boxes == 0) {
            truck = 0;
            container = 0;
        }

        if (boxes > 0) {
            System.out.println("Грузовик: " + truck);
            System.out.println("\tКонтейнер: " + container);
            for (int i = 1; i <= boxes; i++) {
                System.out.println("\t\tЯщик: " + i);
                if (i % (contInTruck * boxInCont) == 0) {
                    truck++;
                    System.out.println("Грузовик: " + truck);
                }
                if (i % boxInCont == 0) {
                    if (i != boxes) {
                        container++;
                        System.out.println("\tКонтейнер: " + container);
                    }
                }
            }
            System.out.println("Необходимо:" + System.lineSeparator() + "грузовиков - " + truck + " шт." +
                    System.lineSeparator() + "контейнеров - " + container + " шт.");

        } else {
            System.out.println("Необходимо:" + System.lineSeparator() + "грузовиков - " + truck + " шт." +
                    System.lineSeparator() + "контейнеров - " + container + " шт.");
        }
    }
}