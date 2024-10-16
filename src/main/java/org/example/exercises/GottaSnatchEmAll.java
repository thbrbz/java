package org.example.exercises;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return Set.copyOf(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.isEmpty() || theirCollection.isEmpty()) return false;
        return !theirCollection.containsAll(myCollection) && !myCollection.containsAll(theirCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<>(collections.getFirst());
        collections.forEach(common::retainAll);
        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>();
        collections.forEach(all::addAll);
        return all;
    }
}
