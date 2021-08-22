package com.vega;

public class Weapon extends Item {

    private int damage;

    public Weapon(String _name, int _damage) {
       super(_name);

       damage = _damage;
    }

    @Override
    public void Use() {
        System.out.println("You use " + super.GetName() + " to do " + damage + " damage!");
    }
}
