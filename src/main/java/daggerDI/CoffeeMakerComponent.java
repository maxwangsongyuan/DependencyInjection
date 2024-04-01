package daggerDI;

import dagger.Component;

@Component(modules = CoffeeMakerModule.class)
interface CoffeeMakerComponent {
    CoffeeMaker make();
}
