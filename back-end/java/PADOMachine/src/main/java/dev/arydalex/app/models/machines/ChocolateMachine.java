package dev.arydalex.app.models.machines;

import dev.arydalex.app.models.products.Chocolate;
import dev.arydalex.app.models.products.HotDrink;

public class ChocolateMachine implements HotDrinkMachine {
    @Override
    public HotDrink makeDrink() {
        return new Chocolate();
    }
}
