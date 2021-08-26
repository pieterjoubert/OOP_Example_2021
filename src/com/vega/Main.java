package com.vega;

public class Main {

    public static void main(String[] args) {
        Character hero = new Character("Pieter Joubert",100,10);
        System.out.println(hero.displayInfo());

        //Take some damage and display updated  hero information
        hero.takeDamage(30);
        System.out.println(hero.displayInfo());

        Weapon longsword = new Weapon("Narsil", 100);
        longsword.use();

        Consumable potion = new Consumable("Greater Healing Potion", 25);
        potion.use();

    }
}
