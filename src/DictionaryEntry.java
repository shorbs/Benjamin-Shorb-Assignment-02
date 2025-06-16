public class  DictionaryEntry {
    private String word;
    private String partOfSpeech;
    private String definition;

    DictionaryEntry() {

    }

    DictionaryEntry(String word, String partOfSpeech, String definition) {
        this.word = word;
        this.partOfSpeech = partOfSpeech;
        this.definition = definition;
    }

    public String getWord() {
        return word;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public String getDefinition() {
        return definition;
    }

    public String toString() {
        return word + " " + "[" + partOfSpeech + "]" + " " + definition;
    }
}