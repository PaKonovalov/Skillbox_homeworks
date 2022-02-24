package ru.skillbox;

public class Display {

    public DisplayType displayType;
    private final int displayDiagonal;
    private final double displayWeight;

    public Display(DisplayType displayType, int displayDiagonal, double displayWeight) {
        this.displayType = displayType;
        this.displayDiagonal = displayDiagonal;
        this.displayWeight = displayWeight;
    }

    public int getDisplayDiagonal() {
        return displayDiagonal;
    }

    public double getDisplayWeight() {
        return displayWeight;
    }

    @Override
    public String toString() {
        return "Display type: " + displayType + ", Display diagonal: " + displayDiagonal;
    }
}
