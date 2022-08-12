public class Lamp implements ElectricityConsumer{

    public void lightOn(){
        System.out.println("lamp is switch on");
    }

    @Override
    public void electricityOn() {
        lightOn();

    }
}
