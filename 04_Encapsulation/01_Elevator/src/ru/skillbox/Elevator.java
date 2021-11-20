package ru.skillbox;
public class Elevator {
    private int currentFloor = 1, minFloor, maxFloor;

    public Elevator(int minFloor, int maxFloor) { //Это конструктор для лимита этажей
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() { // метод возвращающий значение того на каком этаже находится лифт
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor < minFloor ? currentFloor + 1 : currentFloor; // расчет перемещающий лифта на один этаж вниз,
        // так же тут прописывам проверку возможности движения лифта на 1 этаж вниз
        // используя тернанрные операторы
    }

    public void moveUp() {
        currentFloor = currentFloor > maxFloor ? currentFloor - 1 : currentFloor; // расчет перемещающий лифта на один этаж вверх,
        // так же тут прописывам проверку возможности движения лифта на 1 этаж ввверх
        // используя тернанрные операторы
    }

    public void move(int floor) { // тут код для движения лифта, с проверкой этажности и вывода результата в консоль
        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Неверный этаж");
            return;
        } else {
            }

        for (; getCurrentFloor() < floor; currentFloor++) {
                moveUp();
                System.out.println("Лифт на " + currentFloor + " этаже");
        }

        while (floor <= currentFloor) {
                moveDown();
                System.out.println("Лифт на " + currentFloor-- + " этаже");
        }
    }
}

