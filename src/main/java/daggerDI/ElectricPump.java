package daggerDI;

import javax.inject.Inject;

class ElectricPump implements Pump {
    private final Heater heater;

    @Inject
    ElectricPump(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void pump() {
        if (heater != null) {
            heater.heat();
            System.out.println("Pumping...");
        }
    }
}