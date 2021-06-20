package com.company.players;

public class Medic extends Hero{
    private int healPoints;

    public Medic(int health, int damage, int healPoints) {
        super(health, damage, SuperAbility.HEAL);
    }


    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length ; i++) {
            if (this != heroes[i] && heroes[i].getHealth() > 0 && heroes[i].getHealth() < 200);
            heroes[i].setHealth(heroes[i].getHealth() + healPoints);
        }
    }
}
