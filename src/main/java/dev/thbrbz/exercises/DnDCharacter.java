package dev.thbrbz.exercises;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class DnDCharacter {

    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;

    DnDCharacter() {
        this.strength = this.ability(rollDice());
        this.dexterity = this.ability(rollDice());
        this.constitution = this.ability(rollDice());
        this.intelligence = this.ability(rollDice());
        this.wisdom = this.ability(rollDice());
        this.charisma = this.ability(rollDice());
    }

    int ability(List<Integer> scores) {
        return scores.stream()
                .sorted()
                .skip(1)
                .mapToInt(Integer::valueOf)
                .sum();
    }

    List<Integer> rollDice() {
        return IntStream.range(0, 4)
                .map(x -> (int) (Math.random() * 6) + 1)
                .boxed()
                .collect(Collectors.toList());
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
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
        return this.modifier(this.getConstitution()) + 10;
    }
}
