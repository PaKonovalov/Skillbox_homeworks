package ru.skillbox;

public class MemoryDevice {

    public MemoryDeviceType memoryDeviceType;
    private final int memoryDeviceVolume;
    private final double memoryDeviceWeight;

    public MemoryDevice(MemoryDeviceType memoryDeviceType, int memoryDeviceVolume, double memoryDeviceWeight) {
        this.memoryDeviceType = memoryDeviceType;
        this.memoryDeviceVolume = memoryDeviceVolume;
        this.memoryDeviceWeight = memoryDeviceWeight;
    }

    public int getMemoryDeviceVolume() {
        return memoryDeviceVolume;
    }

    public double getMemoryDeviceWeight() {
        return memoryDeviceWeight;
    }

    @Override
    public String toString() {
        return "Memory device type: " + memoryDeviceType + ", Memory device volume: " + memoryDeviceVolume;
    }
}
