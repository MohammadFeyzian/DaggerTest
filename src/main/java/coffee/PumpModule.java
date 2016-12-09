package main.java.coffee;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Mohammad on 12/9/2016.
 */

@Module
public abstract class PumpModule {

    @Binds
    abstract Pump providePump(Thermosiphon pump);
}
