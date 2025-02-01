package dev.thbrbz.exercises;

class RnaTranscription {

    String transcribe(String dnaStrand) {

        StringBuilder sb = new StringBuilder();
        for (char c : dnaStrand.toCharArray()) {
            switch (c) {
                case 'G' -> sb.append("C");
                case 'C' -> sb.append("G");
                case 'T' -> sb.append("A");
                case 'A' -> sb.append("U");
                default -> throw new IllegalArgumentException("Invalid DNA nucleotide: " + c);
            };
        }

        return sb.toString();
    }

    String transcribeRNA(String rnaStrand) {
        return rnaStrand
            .replace('A', 'U')
            .replace('T', 'A')
            .replace('C', 'X')
            .replace('G', 'C')
            .replace('X', 'G');
    }

}
