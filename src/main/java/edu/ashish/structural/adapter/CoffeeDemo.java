package edu.ashish.structural.adapter;

public class CoffeeDemo {

    public static void main(String[] args) {

        CoffeeMachineInterface newCoffeeMachine = new CoffeeTouchscreenAdapter(new OldCoffeeMachine());
        newCoffeeMachine.chooseFirstSelection();
        newCoffeeMachine.chooseSecondSelection();
    }
}
