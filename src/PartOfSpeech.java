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
}
