package edu.ntnu.idatt2001.Wargames.Units;

public class CommanderUnit extends CavalryUnit{

    public CommanderUnit(String name, int health, int attack, int armor) {
        super(name, health, 25, 15);
    }

    public CommanderUnit(String name, int health) {
        super(name, health);
    }



}
