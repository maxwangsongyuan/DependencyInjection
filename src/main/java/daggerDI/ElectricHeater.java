package daggerDI;

class ElectricHeater implements Heater {
    @Override
    public void heat() {
        System.out.println("Heating with electricity");
    }
}