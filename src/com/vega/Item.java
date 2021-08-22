package com.vega;

public class Item {
    private String name;

    public Item(String _name) {
        name = _name;
    }

    public String GetName() {
        return name;
    }

    public void Equip() {
        System.out.println("You have equipped: " + name);
    }

    public void Use() {
        System.out.println("You use: " + name);
    }
}
