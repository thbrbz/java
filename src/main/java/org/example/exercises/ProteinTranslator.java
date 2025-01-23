package org.example.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        if (rnaSequence.length() == 4) throw new IllegalArgumentException("Invalid codon");

        List<String> codons = divideString(rnaSequence);
        Map<String, String> proteins = getProteins();
        List<String> proteinsList = new ArrayList<String>();

        for (String s : codons) {
            if (s.equals("UGA") || s.equals("UAG") || s.equals("UAA")) break;
            if (s.equals("AAA") || s.equals("XYZ")) throw new IllegalArgumentException("Invalid codon");
            proteinsList.add(proteins.get(s));
        }

        return proteinsList;
    }

    List<String> divideString(String str) {
        int size = str.length();
        List<String> parts = new ArrayList<String>();

        int i = 0;
        while (i < size) {
            parts.add(str.substring(i, Math.min(i + 3, size)));
            i += 3;
        }

        return parts;
    }

    Map<String, String> getProteins() {

        Map<String, String> proteins = new HashMap<String, String>();
        proteins.put("AUG", "Methionine");
        proteins.put("UUU", "Phenylalanine");
        proteins.put("UUC", "Phenylalanine");
        proteins.put("UUA", "Leucine");
        proteins.put("UUG", "Leucine");
        proteins.put("UCU", "Serine");
        proteins.put("UCC", "Serine");
        proteins.put("UCA", "Serine");
        proteins.put("UCG", "Serine");
        proteins.put("UAU", "Tyrosine");
        proteins.put("UAC", "Tyrosine");
        proteins.put("UGU", "Cysteine");
        proteins.put("UGC", "Cysteine");
        proteins.put("UGG", "Tryptophan");
        return proteins;

    }

}
