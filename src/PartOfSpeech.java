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
    public static boolean validPartOfSpeech(String partOfSpeech){
        if(partOfSpeech == null)return false;
        for(PartOfSpeech p : PartOfSpeech.values()){
            if(p.toString().equalsIgnoreCase(partOfSpeech))
                return true;
        }
        return false;
    }
    //IMPLEMENT CHECK FOR "TO BE IMPLEMENTED"
}
