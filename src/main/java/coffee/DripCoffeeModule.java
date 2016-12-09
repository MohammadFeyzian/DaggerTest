package main.java.coffee;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * Created by Mohammad on 12/9/2016.
 */

@Module(includes = PumpModule.class)
public class DripCoffeeModule {

    @Provides
    @Singleton
    Heater provideHeater(){
        return new ElectricHeater();
    }
}
