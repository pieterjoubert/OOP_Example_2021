package com.vega;

import java.util.List;
import java.util.ArrayList;

public class Character {

    //private fields
    private String name;
    private int hp;
    private int damage;
    private List<Item> inventory;

    //constructor
    public Character(String _name, int _hp, int _damage) {
        name = _name;
        hp = _hp;
        damage = _damage;
        inventory = new ArrayList<Item>(); //Empty List to Store Items
    }

    //Name Getter
    public String GetName() {
        return name;
    }

    //method to update hitpoints based on a damage value
    public void TakeDamage(int _damage) {
        hp = hp - _damage;
    }

    //HP Getter
    public int GetHP() {
        return hp;
    }

    //Damage Getter
    public int GetDamage () {
        return damage;
    }

    public String DisplayInfo() {
        String temp = "";
        temp += "\t\t" + name + "\n " + "Stats: [" + hp + "," + damage + "]";
        return temp;
    }

}
