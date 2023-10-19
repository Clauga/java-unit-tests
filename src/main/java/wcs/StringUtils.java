package wcs;


public class StringUtils {

    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        if (candidate == null) {
            throw new NullPointerException("null");
        }
        String vowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                vowels += letters[i];
            }
        }
        return vowels;
    }
    public static String uniqueVowels(String candidate) {
        if (candidate == null) {
            throw new NullPointerException("Le paramètre ne peut pas être nul");
        }
        StringBuilder uniqueVowels = new StringBuilder();
        char[] letters = candidate.toCharArray();
        String lowercaseVowels = ALL_VOWELS.toLowerCase();

        for (char letter : letters) {
            char lowercaseLetter = Character.toLowerCase(letter);
            if (lowercaseVowels.indexOf(lowercaseLetter) >= 0 && uniqueVowels.indexOf(String.valueOf(lowercaseLetter)) == -1) {
                uniqueVowels.append(lowercaseLetter);
            }
        }

        return uniqueVowels.toString();
    }

}