package dev.arydalex.app.models.machines;

import dev.arydalex.app.models.products.HotDrink;
import dev.arydalex.app.models.products.Tea;

public class TeaMachine implements HotDrinkMachine {

    @Override
    public HotDrink makeDrink() {
        return new Tea();
    }

}