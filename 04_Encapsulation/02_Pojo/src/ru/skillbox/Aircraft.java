package ru.skillbox;

public class Aircraft {
    private String aircraftMogel;
    private double aircraftWeight;
    private int numberOfSeats;

    public Aircraft (String aircraftMogel, double aircraftWeight, int numberOfSeats){
        this.aircraftMogel = aircraftMogel;
        this.aircraftWeight = aircraftWeight;
        this.numberOfSeats = numberOfSeats;
    }

    public void setAircraftMogel (String aircraftMogel) {
        this.aircraftMogel = aircraftMogel;
    }

    public String getAircraftMogel () {
        return aircraftMogel;
    }

    public void setAircraftWeight (double aircraftWeight) {
        this.aircraftWeight  = aircraftWeight;
    }

    public double getAircraftWeight () {
        return aircraftWeight;
    }

    public void setNumberOfSeats (int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats () {
        return numberOfSeats;
    }
}
