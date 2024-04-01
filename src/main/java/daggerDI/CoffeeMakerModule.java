package daggerDI;

import dagger.Provides;
import dagger.Module;
import dagger.multibindings.StringKey;

@Module
class CoffeeMakerModule {
    @Provides
    @StringKey("GasHeater")
    Heater provideGasHeater() {
//        return new ElectricHeater();
        return new GasHeater();
    }

    @Provides
    @StringKey("ElectricHeater")
    Heater provideElectricHeater() {
        return new ElectricHeater();
//        return new GasHeater();
    }

    @Provides
    Pump providePump(Heater heater) {
        return new ElectricPump(heater);
    }
}