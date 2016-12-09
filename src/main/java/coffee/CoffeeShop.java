package main.java.coffee;

import dagger.Component;

import javax.inject.Singleton;

/**
 * Created by Mohammad on 12/9/2016.
 */

@Singleton
@Component(modules = {DripCoffeeModule.class})
public interface CoffeeShop {

    CoffeeMaker maker();
}
