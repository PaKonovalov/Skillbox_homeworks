package ru.skillbox;

public class Country {
    private String counName;
    private String сounName;
    private String populationSize;
    private double squareKilometersArea;
    private String nameOfTheCapital;
    private String exitToTheSea;

    public Country (String сounName) {
        this.counName = сounName;
    }

    public void setCounName(String сounName) {
        this.counName = сounName;
    }

    public String getName() {
        return сounName;
    }

    public void setPopulationSize(String populationSize) {
        this.populationSize = populationSize;
    }

    public String getPopulationSize() {
        return populationSize;
    }

    public void setSquareKilometersArea (double squareKilometersArea) {
        this.squareKilometersArea = squareKilometersArea;
    }

    public double getSquareKilometersArea() {
        return squareKilometersArea;
    }

    public void setNameOfTheCapital(String nameOfTheCapital) {
        this.nameOfTheCapital = nameOfTheCapital;
    }

    public String getNameOfTheCapital() {
        return nameOfTheCapital;
    }

    public void setExitToTheSea(String exitToTheSea) {
        this.exitToTheSea = exitToTheSea;
    }

    public String getExitToTheSea() {
        return exitToTheSea:
    }
}
