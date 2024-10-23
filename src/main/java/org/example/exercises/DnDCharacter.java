package org.example.exercises;

import java.util.List;
import java.util.ArrayList;

public class DnDCharacter {

    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;
    int hitpoints;

    public int ability(List<Integer> scores) {
         return scores.stream()
                 .sorted()
                 .skip(1)
                 .mapToInt(Integer::valueOf)
                 .sum();
    }

    public List<Integer> rollDice() {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++)
            numbers.add((int) (Math.random() * 6) + 1);

        return numbers;
    }

    int modifier(int input) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return this.hitpoints;
    }
}
