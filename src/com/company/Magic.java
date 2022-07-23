package com.company;

public class Magic extends Hero{

    public Magic(int health, int damage, String superPower) {
        super(health, damage, superPower);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил способность" + getSuperPower());


    }

    @Override
    public String info() {
        return super.info();
    }
}

