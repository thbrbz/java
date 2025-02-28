package dev.thbrbz.exercises;

import java.util.HashMap;
import java.util.Map;

public class DialingCodes {
    private final Map<Integer, String> countries = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return this.countries;
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
        for (Map.Entry<Integer, String> entry : this.getCodes().entrySet())
            if (entry.getValue().equals(country))
                return entry.getKey();

        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = this.findDialingCode(country);

        if (oldCode != null) {
            this.getCodes().remove(oldCode);
            this.getCodes().put(code, country);
        }
    }
}
