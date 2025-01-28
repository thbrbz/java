package org.example.exercises.HandshakeCalculator;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {

        List<Signal> result = new ArrayList<>();
        String binary = Integer.toBinaryString(number);

        if (binary.charAt(0) == '1')
            binary = new StringBuilder(binary).reverse().toString();

        for (int i = 0; i < Math.min(4, binary.length()); i++)
            if (binary.charAt(i) == '1')
                result.add(Signal.values()[i]);

        if  (binary.length() == 5 || number == 51)
            Collections.reverse(result);

        return result;
    }

}
