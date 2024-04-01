package daggerDI;

import javax.inject.Inject;

class CoffeeMaker {
    private final Heater heater;
    private final Pump pump;

    @Inject
    CoffeeMaker(Heater heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public void brew() {
        heater.heat();
        pump.pump();
        System.out.println("Coffee brewing");
    }
}