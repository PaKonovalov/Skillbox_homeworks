package ru.skillbox;
public class Elevator {
    private int currentFloor = 1, minFloor, maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor < minFloor ? currentFloor - 1 : currentFloor;
        System.out.println("Лифт на " + currentFloor-- + " этаже");
    }

    public void moveUp() {
        currentFloor = currentFloor > maxFloor ? currentFloor + 1 : currentFloor;
        System.out.println("Лифт на " + currentFloor++ + " этаже");

    }

    public void move(int floor) {
        if (currentFloor == floor) {
        }

        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Неверный этаж");
            return;
        }

        while (getCurrentFloor() != floor) {
            if (currentFloor < floor) {
                moveUp();
            } else {
                moveDown();
            }
        }
        System.out.println("Лифт на " + currentFloor + " этаже");
    }
}

