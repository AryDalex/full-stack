package dev.arydalex.app.models.machines;

import dev.arydalex.app.models.products.Coffee;
import dev.arydalex.app.models.products.HotDrink;

public class CoffeeMachine implements HotDrinkMachine {

    @Override
    public HotDrink makeDrink() {
        return new Coffee();
    }

}
