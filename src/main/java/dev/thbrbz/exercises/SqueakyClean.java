package dev.thbrbz.exercises;

class SqueakyClean {

    static String clean(String identifier) {
        String result = spacesToUnderscores(identifier);
        result = convertKebabToCamel(result);
        result = convertLeetspeak(result);
        result = omitSpecialCharacters(result);
        return result;
    }

    static String spacesToUnderscores(String value) {
        return value.replaceAll(" ", "_");
    }

    static String convertKebabToCamel(String value) {
        while (value.indexOf("-") > 0) {
            int index = value.indexOf("-");
            value = value.replaceFirst("-", "");
            String letter = Character.toString(value.charAt(index));
            value = value.substring(0, index) + letter.toUpperCase() + value.substring(index+1);
        }
        return value;
    }

    static String convertLeetspeak(String value) {
        return value
                .replaceAll("0", "o")
                .replaceAll("3", "e")
                .replaceAll("7", "t")
                .replaceAll("4", "a")
                .replaceAll("1", "l");
    }

    static String omitSpecialCharacters(String value) {
        return value.replaceAll("[^\\w\\s]|_/g", "");
    }

}
