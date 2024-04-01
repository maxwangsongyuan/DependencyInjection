package daggerDI;

public class GasHeater implements Heater {
    @Override
    public void heat() {
        System.out.println("Heating with gas");
    }
}
