package ru.skillbox;

public class Computer {

    private final String vendor;
    private final String name;

    private Cpu cpu;
    private Ram ram;
    private MemoryDevice memoryDevice;
    private Display display;
    private Keyboard keyboard;
    public double totalWeight;


    public Computer(String vendor, String name, Cpu cpu, Ram ram, MemoryDevice memoryDevice, Display display, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.memoryDevice = memoryDevice;
        this.display = display;
        this.keyboard = keyboard;
        this.totalWeight = totalWeight;
    }

    public String getVendor() {
        return vendor;
    }

    public Computer setVendor(String vendor) {
       return new Computer(vendor, name, cpu, ram, memoryDevice, display, keyboard);
    }

    public String getName() {
        return name;
    }

    public Computer setName(String name) {
       return new Computer(vendor, name, cpu, ram, memoryDevice, display, keyboard);
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Computer setCpu(Cpu cpu) {
        return new Computer(vendor, name, cpu, ram, memoryDevice, display, keyboard);
    }

    public Ram getRam() {
        return ram;
    }

    public Computer setRam(Ram ram) {
        return new Computer(vendor, name, cpu, ram, memoryDevice, display, keyboard);
    }

    public MemoryDevice getMemoryDevice() {
        return memoryDevice;
    }

    public Computer setMemoryDevice(MemoryDevice memoryDevice) {
        return new Computer(vendor, name, cpu, ram, memoryDevice, display, keyboard);
    }

    public Display getDisplay() {
        return display;
    }

    public Computer setDisplay(Display display) {
        return new Computer(vendor, name, cpu, ram, memoryDevice, display, keyboard);
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(vendor, name, cpu, ram, memoryDevice, display, keyboard);
    }

    public double getTotalWeight() {
        return totalWeight = keyboard.getKeyboardWeight() + display.getDisplayWeight() + memoryDevice.getMemoryDeviceWeight() + cpu.getCpuWeight();
    }

    @Override
    public  String toString() {
        return "Computer: " + '\n' +
                "Vendor: " + vendor + ", Name: " + name + '\n' +
                cpu.toString() + '\n' +
                ram.toString() + '\n' +
                memoryDevice.toString() + '\n' +
                display.toString() + '\n' +
                keyboard.toString() + '\n' +
                "Total weight of computer: " + getTotalWeight();
    }
}

