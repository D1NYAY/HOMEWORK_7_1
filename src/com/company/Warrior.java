package com.company;

public class Warrior extends Hero{


    public Warrior(int health, int damage, String superPower) {
            super(health, damage, superPower);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил способность" + getSuperPower());

    }

    @Override
    public String info() {
        return super.info();
    }
}

