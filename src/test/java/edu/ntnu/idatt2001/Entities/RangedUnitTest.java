package edu.ntnu.idatt2001.Entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RangedUnitTest {

    @Test
    public void getResistBonusDecreaseAndStabilize(){
        RangedUnit archer = new RangedUnit("Hawk-Eye", 100);

        assertTrue(archer.getResistBonus() == 6);
        assertTrue(archer.getResistBonus() == 4);
        assertTrue(archer.getResistBonus() == 2);
        assertTrue(archer.getResistBonus() == 2);
        assertTrue(archer.getResistBonus() == 2);

    }

}
