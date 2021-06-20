package com.company.players;

import java.util.Random;

public class Magic extends Hero{


    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random attack = new Random();
        int chance = attack.nextInt(1);
        for(int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(getDamage() + chance);
        }

    }
}
