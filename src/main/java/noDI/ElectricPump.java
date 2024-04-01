package noDI;

class ElectricPump implements Pump {
    private final Heater heater;

    ElectricPump() {
        // Directly creating the heater dependency
        this.heater = new ElectricHeater();
    }

    @Override
    public void pump() {
        heater.heat();
        System.out.println("Pumping...");
    }
}