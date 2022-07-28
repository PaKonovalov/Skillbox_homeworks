class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus(0.001);
        Bus bus2 = new Bus(0.001);
        Bus bus3 = new Bus(0.001);

        ElectricBus eBus1 = new ElectricBus(0.001, 0.1);
        ElectricBus eBus12 = new ElectricBus(0.001, 0.1);

        System.out.println("bus count: " + Bus.getCount());
        System.out.println("eBus count: " + ElectricBus.getCount());
//        bus.refuel(1);
//        System.out.println("Reserve: " + bus.powerReserve());
//        System.out.println("Go 50 km: " + bus.run(50));
//        System.out.println("Reserve: " + bus.powerReserve());
//        System.out.println("Go 900 km: " + bus.run(900));
//        System.out.println("Reserve: " + bus.powerReserve());
//        System.out.println("Go 100 km: " + bus.run(100));
//        System.out.println("Reserve: " + bus.powerReserve());
    }
}