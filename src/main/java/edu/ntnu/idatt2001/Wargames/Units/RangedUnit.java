package edu.ntnu.idatt2001.Wargames.Units;

public class RangedUnit extends Unit{

    public RangedUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
    }

    public RangedUnit(String name, int health){
        super(name, health, 15, 8);

    }
    @Override
    public int getAttackBonus() {
        return 3;
    }

    @Override
    public int getResistBonus() {
        if (armor > 2) armor -= 2;
        //(this.getArmor()-2 > 2) ? getArmor()-2 : 2
        return armor;
    }



}
