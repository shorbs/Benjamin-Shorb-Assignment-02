public class DictionaryEntry {
    private String word;
    private PartOfSpeech partOfSpeech;
    private String definition;

    DictionaryEntry(DictionaryEntry entry) {
        this.word = entry.getWord();
        this.definition = entry.getDefinition();
        this.partOfSpeech = entry.getPartOfSpeech();
    }

    DictionaryEntry(String word, PartOfSpeech partOfSpeech, String definition) {
        this.word = word;
        this.partOfSpeech = partOfSpeech;
        this.definition = definition;
    }

    public String getWord() {
        return word;
    }

    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    public String getDefinition() {
        return definition;
    }

    public String toString() {
        return word + " " + "[" + partOfSpeech.toString() + "]" + " : " + definition;
    }
}