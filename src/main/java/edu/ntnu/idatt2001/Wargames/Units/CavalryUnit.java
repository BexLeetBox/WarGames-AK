package edu.ntnu.idatt2001.Wargames.Units;

public class CavalryUnit extends Unit{

    public CavalryUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
    }

    public CavalryUnit(String name, int health){
        super(name, health, 20, 12);
    }

    @Override
    public int getAttackBonus() {
        return 0;
    }

    @Override
    public int getResistBonus() {
        return 0;
    }
}
