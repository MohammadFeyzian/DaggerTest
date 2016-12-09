package main.java.coffee;

/**
 * Created by Mohammad on 12/9/2016.
 */
public class CoffeeApp {

    public static void main(String[] args){

        CoffeeShop coffeeShop = DaggerCoffeeShop.builder()
                .dripCoffeeModule(new DripCoffeeModule()).build();

//        CoffeeShop coffeeShop = DaggerCoffeeShop.builder().build();
//
//        CoffeeShop coffeeShop = DaggerCoffeeShop.create();

        coffeeShop.maker().brew();


    }
}
