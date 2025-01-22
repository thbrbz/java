package org.example.exercises;

public class EliudsEggs {

    public int eggCount(int number) {

        int[] binaryNum = new int[1000];
        int i = 0;

        while (number > 0) {
            binaryNum[i] = number % 2;
            number = number / 2;
            i++;
        }

        int count = 0;
        for (int j = i - 1; j >= 0; j--)
            if (binaryNum[j] == 1) count += 1;

        return count;
    }
}
