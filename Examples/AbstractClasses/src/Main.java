import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<LightningDevice> lightningDevices = new TreeSet<>(new Comparator<LightningDevice>() {
            @Override
            public int compare(LightningDevice o1, LightningDevice o2) {
                return Integer.compare(o1.getPower(), o2.getPower());
            }
        });

        LightningDevice device = new LightningDevice(400) {
            @Override
            public double getEnergyConsumption() {
                return power * brightness;
            }
        };


//        Lamp lamp = new Lamp(10);  пример использования вложенного статического класса
//        lamp.setType(Lamp.Type.LED);



//        ArrayList<Lamp> lamps = new ArrayList<>();
//        lamps.add(new Lamp(100));
//        lamps.add(new Lamp(20));
//        lamps.add(new Lamp(40));
//        lamps.add(new Lamp(150));
//
//        Collections.sort(lamps);
//
//        for (Lamp lamp : lamps) {
//            System.out.println(lamp);
//        }
    }

}
