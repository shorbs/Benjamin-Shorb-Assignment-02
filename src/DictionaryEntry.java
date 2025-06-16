public class  DictionaryEntry {
    private String word;
    private PartOfSpeech partOfSpeech;
    private String definition;

    DictionaryEntry() {
        this.word = "";
        this.partOfSpeech = null;
        this.definition = "";
    }

    DictionaryEntry(String word, PartOfSpeech partOfSpeech, String definition) {
        this.word = word;
        this.partOfSpeech = partOfSpeech;
        this.definition = definition;
    }

    public String getWord() {
        return word;
    }

    public String getPartOfSpeech() {
        return partOfSpeech.toString();
    }

    public String getDefinition() {
        return definition;
    }

    public String toString() {
        return word + " " + "[" + partOfSpeech + "]" + " : " + definition;
    }
}