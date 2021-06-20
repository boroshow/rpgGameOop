package com.company.players;

import java.util.Random;

public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

        Random warr = new Random();
        int x = warr.nextInt(2)+ 2;
        this.setDamage(getDamage() * x);
        boss.setHealth(boss.getHealth() - getDamage());
        System.out.println("Warrior attack " + this.getDamage());

    }
}
