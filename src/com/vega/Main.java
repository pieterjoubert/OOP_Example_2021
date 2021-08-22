package com.vega;

public class Main {

    public static void main(String[] args) {
        Character hero = new Character("Pieter Joubert",100,10);
        System.out.println(hero.DisplayInfo());

        //Take some damage and display updated  hero information
        hero.TakeDamage(30);
        System.out.println(hero.DisplayInfo());

    }
}
