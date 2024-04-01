package noDI;

class CoffeeMaker {
    private final Heater heater;
    private final Pump pump;

    CoffeeMaker() {
        // Directly creating dependencies
        this.heater = new ElectricHeater();
        this.pump = new ElectricPump();
    }

    public void brew() {
        heater.heat();
        pump.pump();
        System.out.println("Coffee brewing");
    }
}
