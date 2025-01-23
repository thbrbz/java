package org.example.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {

        List<String> proteinsList = new ArrayList<String>();
        if (rnaSequence.isEmpty()) return proteinsList;

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
        proteins.put("UAA", "STOP");
        proteins.put("UAG", "STOP");
        proteins.put("UGA", "STOP");

        for (String codon : rnaSequence.split("(?<=\\G...)")) {
            if (proteins.get(codon) == null)  throw new IllegalArgumentException("Invalid codon");
            if (proteins.get(codon).equals("STOP")) break;
            proteinsList.add(proteins.get(codon));
        }

        return proteinsList;
    }

}
