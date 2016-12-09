package main.java.coffee;

import dagger.Lazy;

import javax.inject.Inject;

/**
 * Created by Mohammad on 12/9/2016.
 */
public class CoffeeMaker {

    private final Lazy<Heater> heater;
    private final Pump pump;

    @Inject
    CoffeeMaker(Lazy<Heater> heater, Pump pump){

        this.heater = heater;
        this.pump = pump;
    }

    public void brew(){
        heater.get().on();
        pump.pump();
        System.out.println("\n\t\t [_]P coffee! [_]P ");
        heater.get().off();
    }
}
