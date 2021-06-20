package com.company.players;

import java.util.Random;

public class Tank extends Hero {

    public Tank(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int saveDamageAndRevert = boss.damage + getDamage();
        boss.setHealth(boss.getHealth() - saveDamageAndRevert);
        System.out.println("Tank damage "+saveDamageAndRevert);

    }

}
