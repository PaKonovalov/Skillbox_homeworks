public class Radio implements ElectricityConsumer {

    public void playRadio() {
        System.out.println("Playing radio");
    }

    @Override
    public void electricityOn() {
        playRadio();
    }
}
