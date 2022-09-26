package dev.arydalex.app;

import dev.arydalex.app.models.machines.DrinkMachine;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        DrinkMachine drinkMachine = new DrinkMachine();
        drinkMachine.prepare();

    }

}