package edu.ntnu.idatt2001.Wargames.Units;

public abstract class Unit {
    private String name;
    private int health;
    private int attack;
    protected int armor;

    public Unit (String name,int health,int attack,int armor){
        this.name  = name;
        this.health = health;
        this.attack =  attack;
        this.armor = armor;
    }

    public void attack(Unit opponent){
        opponent.health -= (attack+getAttackBonus()) - (opponent.armor+getResistBonus());
    }

    public abstract int getAttackBonus();

    public abstract int getResistBonus();

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setHealth(int health) {
        this.health = health;
    }



    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", armor=" + armor +
                '}';
    }
}
