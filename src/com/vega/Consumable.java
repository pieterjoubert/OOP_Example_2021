package com.vega;

public class Consumable extends Item {

    private int value;

    public Consumable(String _name, int _value) {
        super(_name);

        value = _value;
    }

    @Override
    public void Use() {
        System.out.println("You use " + super.GetName() + " to heal " + value + " hp!");
    }
}
