/****************************************************************
 *
 * File: PartOfSpeech.java
 * By: Benjamin Shorb
 * Date: 6/19/2025
 *
 * Description: Simple part of speech enum that holds the available
 * parts of speech in the program
 *
 ****************************************************************/
public enum PartOfSpeech {
    NOUN,
    VERB,
    ADJECTIVE,
    ADVERB,
    PRONOUN,
    PREPOSITION,
    CONJUNCTION,
    INTERJECTION,
    PLACEHOLDER;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

    //IMPLEMENT CHECK FOR VALID PART OF SPEECH
    public static boolean validPartOfSpeech(String partOfSpeech) {
        if (partOfSpeech == null) return false;
        for (PartOfSpeech p : PartOfSpeech.values()) {
            if (p.toString().equalsIgnoreCase(partOfSpeech))
                return true;
        }
        return false;
    }
}
