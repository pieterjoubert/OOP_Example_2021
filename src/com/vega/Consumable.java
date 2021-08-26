package com.vega;

public class Consumable extends Item {

    private int value;

    public Consumable(String _name, int _value) {
        super(_name);

        value = _value;
    }

    @Override
    public void use() {
        System.out.println("You use " + super.getName() + " to heal " + value + " hp!");
    }
}
