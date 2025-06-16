public enum DataSource{
    PLACEHOLDER("Placeholder", PartOfSpeech.ADJECTIVE, "To be updated..."),
    DISTINCT1("Distinct", PartOfSpeech.ADJECTIVE, "Unique. No duplicates. Clearly different or of a different kind."),
    DISTINCT2("Distinct", PartOfSpeech.ADJECTIVE,  "Familiar. Worked in Java.")
    ;
    private final String word;
    private final PartOfSpeech partOfSpeech;
    private final String definition;

    DataSource(String word, PartOfSpeech partOfSpeech, String definition) {
        this.word = word;
        this.partOfSpeech = partOfSpeech;
        this.definition = definition;
    }

    public DictionaryEntry toEntry() {
        return new DictionaryEntry(word, partOfSpeech, definition);
    }
}