package main.java.coffee;


import javax.inject.Inject;

/**
 * Created by Mohammad on 12/9/2016.
 */
public class Thermosiphon implements Pump {

    private final Heater heater;

    @Inject
    Thermosiphon(Heater heater){
        this.heater = heater;
    }

    @Override
    public void pump() {
        if (heater.isHot()){
            System.out.println("\n\t\t=> => pumping => =>");
        }
    }
}
