package dev.thbrbz.exercises;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        String digits = String.valueOf(numberToCheck);
        return numberToCheck == digits.chars()
                .parallel()
                .map(c -> (int) Math.pow(Character.getNumericValue(c), digits.length()))
                .sum();
    }

}
