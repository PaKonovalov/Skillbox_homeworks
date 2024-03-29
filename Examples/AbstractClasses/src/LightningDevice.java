public abstract class LightningDevice
        implements ElectricDevice, Comparable {
    public static final double MAX_BRIGHTNESS = 10D;
    public static final double MIN_BRIGHTNESS = 0D;

    protected final int power;
    protected double brightness;

    public LightningDevice(int power) {
        this.power = power;
    }

    @Override
    public boolean isSwitchedOn() {
        return brightness > 0;
    }

    @Override
    public void switchOn() {
        setBrightness(MAX_BRIGHTNESS);
    }

    @Override
    public void switchOff() {
        setBrightness(MIN_BRIGHTNESS);
    }

    public void setBrightness(double level) {
        if (level < MIN_BRIGHTNESS) {
            brightness = MIN_BRIGHTNESS;
        } else if (level > MAX_BRIGHTNESS) {
            brightness = MAX_BRIGHTNESS;
        } else {
            brightness = level;
        }
    }

    public double getBrightness() {
        return brightness;
    }

    public void changeBrightness(double rate) {
        double changed = brightness + brightness * rate;
        setBrightness(changed);
    }

    @Override
    public int compareTo(Object o) {
        LightningDevice device = (LightningDevice) o;
        return Integer.compare(power, device.power);
    }

    @Override
    public String toString() {
        return getClass().getName() + " with power: " + power;
    }

    public int getPower() {
        return power;
    }
}
