package ru.skillbox;

public class Ram {

    private final String ramType;
    private final int ramVolume;
    private final double ramWeight;

    public Ram(String ramType, int ramVolume, double ramWeight) {
        this.ramType = ramType;
        this.ramVolume = ramVolume;
        this.ramWeight = ramWeight;
    }

    public String getRamType() {
        return ramType;
    }

    public int getRamVolume() {
        return ramVolume;
    }

    public double getRamWeight() {
        return ramWeight;
    }

    @Override
    public String toString() {
        return "Ram type: " + ramType + ", Ram volume: " + ramVolume;
    }
}
