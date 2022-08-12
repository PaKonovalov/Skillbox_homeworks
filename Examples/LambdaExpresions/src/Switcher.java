import java.util.ArrayList;
import java.util.List;

public class Switcher {

    private List<ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListeners(ElectricityConsumer listener) {
        listeners.add(listener);
    }

    public void removeElectricityListeners(ElectricityConsumer listener) {
        listeners.remove(listener);
    }

    public void switchOn(){
        System.out.println("Выключатель включен");
//        if (listeners != null){
//        listeners.electricityOn();
        for (ElectricityConsumer c: listeners) {
            c.electricityOn();
        }

    }
}
