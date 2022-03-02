package ru.skillbox;

public class Cpu {
    private final double cpuFrequency;
    private final int numberOfCoresCpu;
    private final String cpuProducer;
    private final double cpuWeight;

    public Cpu(double cpuFrequency, int numberOfCoresCpu, String cpuProducer, double cpuWeight) {
        this.cpuFrequency = cpuFrequency;
        this.numberOfCoresCpu = numberOfCoresCpu;
        this.cpuProducer = cpuProducer;
        this.cpuWeight = cpuWeight;
    }

    public double getCpuFrequency() {
        return cpuFrequency;
    }

    public int getNumberOfCoresCpu() {
        return numberOfCoresCpu;
    }

    public String getCpuProducer() {
        return cpuProducer;
    }

    public double getCpuWeight() {
        return cpuWeight;
    }

    @Override
    public String toString() {
        return "Cpu frequency: " + getCpuFrequency() + ", Number of cores cpu: " + getNumberOfCoresCpu() + ", Cpu producer: " + getCpuProducer();
    }
}