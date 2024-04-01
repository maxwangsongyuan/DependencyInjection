package noDI;

public class NoDIMain {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.brew();
    }
}