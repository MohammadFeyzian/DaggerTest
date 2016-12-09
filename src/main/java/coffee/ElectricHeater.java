package main.java.coffee;

/**
 * Created by Mohammad on 12/9/2016.
 */
public class ElectricHeater implements Heater {

    boolean heating;

    @Override
    public void on() {
        System.out.println("\n\t\t~ ~ ~ heating ~ ~ ~");
        this.heating = true;
    }

    @Override
    public void off() {
        this.heating = false;
    }

    @Override
    public boolean isHot() {
        return heating;
    }
}
