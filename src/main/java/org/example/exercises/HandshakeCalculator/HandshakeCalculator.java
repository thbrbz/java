package org.example.exercises.HandshakeCalculator;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {

        List<Signal> handshake = new ArrayList<>();

        if ((number & 1) != 0) handshake.add(Signal.WINK);
        if ((number & 2) != 0) handshake.add(Signal.DOUBLE_BLINK);
        if ((number & 4) != 0) handshake.add(Signal.CLOSE_YOUR_EYES);
        if ((number & 8) != 0) handshake.add(Signal.JUMP);

        if ((number & 16) != 0) Collections.reverse(handshake);

        return handshake;
    }

}
