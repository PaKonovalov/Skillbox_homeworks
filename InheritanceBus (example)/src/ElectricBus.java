public class ElectricBus extends Bus {
    private final double minTankFullnessRate;
    private static int count;

    public ElectricBus(double consumptionRate, double minTankFullnessRate) {
        super(consumptionRate);
        this.minTankFullnessRate = minTankFullnessRate;
        count++;
    }

    @Override
    public int powerReserve() {
        double remainingRate = getTankFullnessRate() - minTankFullnessRate;
        if (remainingRate <= 0) {
            return 0;
        }
        return (int) (remainingRate / getConsumptionRate());
    }

    public static int getCount() {
        return count;
    }
}
