package com.company;

public class Main {

    public static void main(String[] args) {
Magic magic = new Magic(100, 25, "fire");
Medic medic = new Medic(100, 5, "heal");
Warrior warrior = new Warrior(120, 50, "splash");
Hero[] hero1 = {magic, medic, warrior};
        for (int i = 0; i < hero1.length; i++) {
            hero1[i].applySuperAbility();
            System.out.println(hero1[i].info());
            if (hero1[i] == medic){
                System.out.println(medic.increaseExperience());
            }

        }




        }
    }

