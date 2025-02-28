package dev.thbrbz.exercises;

import java.util.HashMap;
import java.util.Map;

public class DialingCodes {
    private final Map<Integer, String> codes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return this.codes;
    }

    public void setDialingCode(Integer code, String country) {
        this.getCodes().put(code, country);
    }

    public String getCountry(Integer code) {
        return this.getCodes().get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!this.getCodes().containsValue(country)) this.getCodes().putIfAbsent(code, country);
    }

    public Integer findDialingCode(String country) {
        return codes.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(country))
                .map(entry -> entry.getKey())
                .findFirst()
                .orElse(null);
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = this.findDialingCode(country);

        if (oldCode != null) {
            this.getCodes().remove(oldCode);
            this.getCodes().put(code, country);
        }
    }
}
