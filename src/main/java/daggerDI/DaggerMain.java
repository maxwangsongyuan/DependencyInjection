package daggerDI;

public class DaggerMain {
    public static void main(String[] args) {
        CoffeeMakerComponent component = DaggerCoffeeMakerComponent.create();
        CoffeeMaker coffeeMaker = component.make();
        coffeeMaker.brew();
    }
}
