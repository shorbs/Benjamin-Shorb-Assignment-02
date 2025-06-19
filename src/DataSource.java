public enum DataSource {
    ARROW1("Arrow", PartOfSpeech.NOUN, "Here is one arrow: <IMG> -=>> </IMG>"),

    BOOK1("Book", PartOfSpeech.NOUN, "A set of pages."),
    BOOK2("Book", PartOfSpeech.NOUN, "A written work published in printed or electronic form."),
    BOOK3("Book", PartOfSpeech.VERB, "To arrange for someone to have a seat on a plane."),
    BOOK4("Book", PartOfSpeech.VERB, "To arrange something on a particular date."),

    DISTINCT1("Distinct", PartOfSpeech.ADJECTIVE, "Unique. No duplicates. Clearly different or of a different kind."),
    DISTINCT2("Distinct", PartOfSpeech.ADJECTIVE, "Familiar. Worked in Java."),
    DISTINCT3("Distinct", PartOfSpeech.ADVERB, "Uniquely. Written \"distinctly\"."),
    DISTINCT4("Distinct", PartOfSpeech.NOUN, "A keyword in this assignment."),
    DISTINCT5("Distinct", PartOfSpeech.NOUN, "A keyword in this assignment."),
    DISTINCT6("Distinct", PartOfSpeech.NOUN, "A keyword in this assignment."),
    DISTINCT7("Distinct", PartOfSpeech.NOUN, "An advanced search option."),
    DISTINCT8("Distinct", PartOfSpeech.NOUN, "Distinct is a parameter in this assignment."),

    PLACEHOLDER1("Placeholder", PartOfSpeech.ADJECTIVE, "To be updated..."),
    PLACEHOLDER2("Placeholder", PartOfSpeech.ADJECTIVE, "To be updated..."),
    PLACEHOLDER3("Placeholder", PartOfSpeech.CONJUNCTION, "To be updated..."),
    PLACEHOLDER4("Placeholder", PartOfSpeech.INTERJECTION, "To be updated..."),
    PLACEHOLDER5("Placeholder", PartOfSpeech.NOUN, "To be updated..."),
    PLACEHOLDER6("Placeholder", PartOfSpeech.NOUN, "To be updated..."),
    PLACEHOLDER7("Placeholder", PartOfSpeech.NOUN, "To be updated..."),
    PLACEHOLDER8("Placeholder", PartOfSpeech.PREPOSITION, "To be updated..."),
    PLACEHOLDER9("Placeholder", PartOfSpeech.PRONOUN, "To be updated..."),
    PLACEHOLDER10("Placeholder", PartOfSpeech.VERB, "To be updated..."),
    PLACEHOLDER11("Placeholder", PartOfSpeech.ADVERB, "To be updated..."),

    REVERSE1("Reverse", PartOfSpeech.ADJECTIVE, "On back side."),
    REVERSE2("Reverse", PartOfSpeech.ADJECTIVE, "Opposite to usual or previous arrangement."),
    REVERSE3("Reverse", PartOfSpeech.NOUN, "A dictionary program's parameter."),
    REVERSE4("Reverse", PartOfSpeech.NOUN, "Change to opposite direction."),
    REVERSE5("Reverse", PartOfSpeech.NOUN, "The opposite."),
    REVERSE6("Reverse", PartOfSpeech.NOUN, "To be updated..."),
    REVERSE7("Reverse", PartOfSpeech.NOUN, "To be updated..."),
    REVERSE8("Reverse", PartOfSpeech.NOUN, "To be updated..."),
    REVERSE9("Reverse", PartOfSpeech.NOUN, "To be updated..."),
    REVERSE10("Reverse", PartOfSpeech.VERB, "Change something to opposite."),
    REVERSE11("Reverse", PartOfSpeech.VERB, "Go back."),
    REVERSE12("Reverse", PartOfSpeech.VERB, "Revoke ruling."),
    REVERSE13("Reverse", PartOfSpeech.VERB, "To be updated..."),
    REVERSE14("Reverse", PartOfSpeech.VERB, "To be updated..."),
    REVERSE15("Reverse", PartOfSpeech.VERB, "Turn something inside out.");
    /*
    BOOK1("Book", PartOfSpeech.NOUN, "A set of pages."),
    BOOK3("Book", PartOfSpeech.VERB, "To arrange for someone to have a seat on a plane."),

    DISTINCT1("Distinct", PartOfSpeech.ADJECTIVE, "Unique. No duplicates. Clearly different or of a different kind."),
    DISTINCT4("Distinct", PartOfSpeech.NOUN, "A keyword in this assignment."),
    ARROW1("Arrow", PartOfSpeech.NOUN, "Here is one arrow: <IMG> -=>> </IMG>"),
    DISTINCT5("Distinct", PartOfSpeech.NOUN, "A keyword in this assignment."),
    BOOK2("Book", PartOfSpeech.NOUN, "A written work published in printed or electronic form."),
    BOOK4("Book", PartOfSpeech.VERB, "To arrange something on a particular date."),
    DISTINCT6("Distinct", PartOfSpeech.NOUN, "A keyword in this assignment."),
    DISTINCT7("Distinct", PartOfSpeech.NOUN, "An advanced search option."),
    REVERSE2("Reverse", PartOfSpeech.ADJECTIVE, "Opposite to usual or previous arrangement."),
    DISTINCT8("Distinct", PartOfSpeech.NOUN, "Distinct is a parameter in this assignment."),

    DISTINCT3("Distinct", PartOfSpeech.ADVERB,"Uniquely. Written \"distinctly\"."),
    DISTINCT2("Distinct", PartOfSpeech.ADJECTIVE,  "Familiar. Worked in Java."),
    PLACEHOLDER2("Placeholder", PartOfSpeech.ADJECTIVE, "To be updated..."),
    PLACEHOLDER3("Placeholder", PartOfSpeech.CONJUNCTION, "To be updated..."),
    REVERSE5("Reverse", PartOfSpeech.NOUN, "The opposite."),
    PLACEHOLDER4("Placeholder", PartOfSpeech.INTERJECTION, "To be updated..."),
    PLACEHOLDER5("Placeholder", PartOfSpeech.NOUN, "To be updated..."),
    PLACEHOLDER6("Placeholder", PartOfSpeech.NOUN, "To be updated..."),
    PLACEHOLDER7("Placeholder", PartOfSpeech.NOUN, "To be updated..."),
    PLACEHOLDER8("Placeholder", PartOfSpeech.PREPOSITION, "To be updated..."),
    PLACEHOLDER9("Placeholder", PartOfSpeech.PRONOUN, "To be updated..."),
    PLACEHOLDER10("Placeholder", PartOfSpeech.VERB, "To be updated..."),
    PLACEHOLDER11("Placeholder", PartOfSpeech.ADVERB, "To be updated..."),

    REVERSE1("Reverse", PartOfSpeech.ADJECTIVE, "On back side."),
    REVERSE3("Reverse", PartOfSpeech.NOUN, "A dictionary program's parameter."),
    REVERSE4("Reverse", PartOfSpeech.NOUN, "Change to opposite direction."),
    PLACEHOLDER1("Placeholder", PartOfSpeech.ADJECTIVE, "To be updated..."),
    REVERSE15("Reverse", PartOfSpeech.VERB, "Turn something inside out.")
    REVERSE12("Reverse", PartOfSpeech.VERB, "Revoke ruling."),
    REVERSE7("Reverse", PartOfSpeech.NOUN, "To be updated..."),
    REVERSE8("Reverse", PartOfSpeech.NOUN, "To be updated..."),
    REVERSE10("Reverse", PartOfSpeech.VERB, "Change something to opposite."),
    REVERSE6("Reverse", PartOfSpeech.NOUN, "To be updated..."),
    REVERSE9("Reverse", PartOfSpeech.NOUN, "To be updated..."),
    REVERSE11("Reverse", PartOfSpeech.VERB, "Go back."),
    REVERSE13("Reverse", PartOfSpeech.VERB, "To be updated..."),
    REVERSE14("Reverse", PartOfSpeech.VERB, "To be updated..."),

     */
    private final String word;
    private final PartOfSpeech partOfSpeech;
    private final String definition;

    DataSource(String word, PartOfSpeech partOfSpeech, String definition) {
        this.word = word;
        this.partOfSpeech = partOfSpeech;
        this.definition = definition;
    }

    public String getWord() {
        return this.word;
    }

    public PartOfSpeech getPartOfSpeech() {
        return this.partOfSpeech;
    }

    public String getDefinition() {
        return this.definition;
    }

    public DictionaryEntry toEntry() {
        return new DictionaryEntry(word, partOfSpeech, definition);
    }
}