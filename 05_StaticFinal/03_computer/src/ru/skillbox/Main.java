package ru.skillbox;

public class Main {

    public static void main(String[] args) {
    Cpu cpu = new Cpu(2.7, 4,"Intel", 50);
    Ram ram = new Ram("DDR3", 16, 400);
    MemoryDevice memoryDevice = new MemoryDevice(MemoryDeviceType.SSD, 256, 500);
    Display display = new Display(DisplayType.IPS, 27, 2500);
    Keyboard keyboard = new Keyboard("Mechanical",1000, KeyboardLight.YES);
    Computer computer = new Computer("HP", "4570-14", cpu, ram, memoryDevice, display, keyboard);
    computer.setCpu(cpu);
    computer.setRam(ram);
    computer.setMemoryDevice(memoryDevice);
    computer.setDisplay(display);
    computer.setKeyboard(keyboard);
    System.out.println(computer.toString());
    }
}
