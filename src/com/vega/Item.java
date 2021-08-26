package com.vega;

public class Item {
    private String name;

    public Item(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }

    public void equip() {
        System.out.println("You have equipped: " + name);
    }

    public void use() {
        System.out.println("You use: " + name);
    }
}
