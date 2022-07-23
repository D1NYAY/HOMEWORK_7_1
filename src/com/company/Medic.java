package com.company;

public class Medic extends Hero{
    private  int healPoints = 100;

    public Medic(int health, int damage, String superPower) {
        super(health, damage, superPower);
    }


    public String increaseExperience()
    {  double tenPercent = (((10 * healPoints) / 100) + healPoints);
        return "Heal Points: " + healPoints + " увеличелся на 10% стало: " + tenPercent;
    }


    @Override
    public String info() {
        return super.info();
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил способность" + getSuperPower());


        }

    }


