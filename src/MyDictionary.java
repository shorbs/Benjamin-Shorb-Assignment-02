import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyDictionary {
    private final Map<String, List<DictionaryEntry>> myDictionary = new HashMap<>();

    private final List<String> exits = new ArrayList<>(Arrays.asList(
            "!q",
            "exit",
            "quit"
    ));

    private int keyWords = 0;
    private int definitions = 0;

    MyDictionary() {}

    public void loadDictionary() {
        for(DataSource data : DataSource.values()) {
            DictionaryEntry e = new DictionaryEntry(data.toEntry());
            if(!myDictionary.containsKey(e.getWord())) {
                myDictionary.put(e.getWord(), new ArrayList<>());
                keyWords++;
            }
            myDictionary.get(e.getWord()).add(e);
            definitions++;
        }
        //Sort
        for(String key : myDictionary.keySet()) {
            myDictionary.get(key).sort(Comparator.comparing(
                    entry -> entry.getWord() + entry.getPartOfSpeech().toString() + entry.getDefinition()
            ));
        }
    }

    public void runInterface() {
        int i = 1;

        System.out.println("! Loading data...");
        loadDictionary();
        System.out.println("! Loading completed...");
        System.out.println();
        System.out.println("===== DICTIONARY 340 JAVA =====");
        System.out.println("----- Keywords: " + keyWords);
        System.out.println("----- Definitions: " + definitions);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Search [" + i + "]: ");
            input = scanner.nextLine();
            if (exits.contains(input.toLowerCase())) {
                break;
            }
            if (input.equalsIgnoreCase("!help") || input.isBlank()) {
                displayHowTo();
            } else {
               if(!queryDictionary(getParameters(input))) {
                   System.out.println("<NOT FOUND> To be considered for the next release. Thank you.");
                   displayHowTo();
               }
            }
            i++;
        }
        System.out.println("\n -----THANK YOU-----");
    }

    public void readFromFile() {
        int i = 1;

        System.out.println("! Loading data...");
        loadDictionary();
        System.out.println("! Loading completed...");
        System.out.println();
        System.out.println("===== DICTIONARY 340 JAVA =====");
        System.out.println("----- Keywords: " + keyWords);
        System.out.println("----- Definitions: " + definitions);
        System.out.println();

        String filePath = "src/inputs.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String input;
            while ((input = br.readLine()) != null) {
                System.out.println("Search [" + i + "]: " + input);
                if (exits.contains(input.toLowerCase())) {
                    break;
                }
                if (input.equalsIgnoreCase("!help") || input.isBlank()) {
                    displayHowTo();
                } else {
                    if(!queryDictionary(getParameters(input))) {
                        System.out.println("<NOT FOUND> To be considered for the next release. Thank you.");
                        displayHowTo();
                    }
                }
                i++;
            }
            System.out.println("\n -----THANK YOU-----");
        } catch (IOException e){
            System.out.println("<NOT FOUND> Please enter a valid file path.");
        }

    }

    private boolean queryDictionary(List<String> parameters) {
        if(parameters.isEmpty()){
            displayHowTo();
            return false;
        }
        String keyWord = parameters.get(0);
        if(myDictionary.containsKey(keyWord)) {
            parameters.remove(0);
            List<DictionaryEntry> tempList = new ArrayList<>(myDictionary.get(keyWord));
            if(!parameters.isEmpty()){
                if(PartOfSpeech.validPartOfSpeech(parameters.get(0))) {
                    tempList = getParsedByPartOfSpeech(parameters.get(0), tempList);
                }
                if(parameters.contains("distinct")){
                    tempList = getDistinctEntries(tempList);
                }
                if(parameters.contains("reverse")) {
                    tempList = getReverseEntries(tempList);
                }
            }
            if(tempList.isEmpty()){
                return false;
            }
            System.out.println("|");
            for(DictionaryEntry e : tempList){
                System.out.println(e.toString());
            }
            System.out.println("|");
            return true;
        }

        return false;
    }

    private List<DictionaryEntry> getParsedByPartOfSpeech(String partOfSpeechToFind, List<DictionaryEntry> entries) {
        if (entries.isEmpty()){
            return null;
        }
        entries.removeIf(e -> !partOfSpeechToFind.equalsIgnoreCase((e.getPartOfSpeech().name())));
        return entries;
    }

    private List<DictionaryEntry> getDistinctEntries(List<DictionaryEntry> entries) {
        if(entries.isEmpty()){
            return null;
        }
        List<String> seenDefinitions = new ArrayList<>();
        List<DictionaryEntry> entriesDistinct = new ArrayList<>();
        for(DictionaryEntry entry : entries){
            if(!seenDefinitions.contains(entry.toString())){
                seenDefinitions.add(entry.toString());
                entriesDistinct.add(entry);
            }
        }
        return entriesDistinct;
    }

    private List<DictionaryEntry> getReverseEntries(List<DictionaryEntry> entries) {
        if(entries.isEmpty()){
            return null;
        }
        int left = 0;
        int right = entries.size() - 1;
        while(left < right){
            DictionaryEntry temp = entries.get(left);
            entries.set(left, entries.get(right));
            entries.set(right, temp);
            left++;
            right--;
        }
        return entries;
    }

    //IMPLEMENT GET PARAMETERS METHOD
    private List<String> getParameters(String input) {
        String[] tokens = input.toLowerCase().trim().split("\\s+");
        List<String> parameters = new ArrayList<>();

        String keyword = tokens[0].substring(0,1).toUpperCase() + tokens[0].substring(1);
        parameters.add(keyword);

        String partOfSpeech = null;
        boolean distinct = false;
        boolean reverse = false;

        //FIRST PARAMETER
        if (tokens.length > 1) {
            String param2 = tokens[1];
            if (PartOfSpeech.validPartOfSpeech(param2)) {
                partOfSpeech = param2;
            } else if (param2.equals("distinct")) {
                distinct = true;
            } else if (param2.equals("reverse")) {
                reverse = true;
            } else {
                System.out.println("|");
                System.out.println("<The entered 2nd parameter '" + param2 + "' is NOT a part of speech.");
                System.out.println("<The entered 2nd parameter '" + param2 + "' is NOT 'distinct'.");
                System.out.println("<The entered 2nd parameter '" + param2 + "' is NOT 'reverse'.");
                System.out.println("<The entered 2nd parameter '" + param2 + "' was disregarded.");
                System.out.println("<The 2nd parameter should be a part of speech or 'distinct' or 'reverse'.>");
                System.out.println("|");
            }
        }
        if (tokens.length > 2) {
            String param3 = tokens[2];
            if (param3.equals("distinct")) {
                distinct = true;
            } else if (param3.equals("reverse")) {
                reverse = true;
            } else {
                System.out.println("|");
                System.out.println("<The entered 3rd parameter '" + param3 + "' is NOT 'distinct'.");
                System.out.println("<The entered 3rd parameter '" + param3 + "' is NOT 'reverse'.");
                System.out.println("<The entered 3rd parameter '" + param3 + "' was disregarded.");
                System.out.println("<The 3rd parameter should be 'distinct' or 'reverse'.>");
                System.out.println("|");
            }
        }
        if (tokens.length > 3) {
            String param4 = tokens[3];
            if (param4.equals("reverse")) {
                reverse = true;
            } else {
                System.out.println("|");
                System.out.println("<The entered 4th parameter '" + param4 + "' is NOT 'reverse'.");
                System.out.println("<The entered 4th parameter '" + param4 + "' was disregarded.");
                System.out.println("<The 4th parameter should be 'reverse'.>");
                System.out.println("|");
            }
        }
        if (tokens.length > 4) {
            displayHowTo();
        }
        if (partOfSpeech != null) {
            parameters.add(partOfSpeech);
        }
        if (distinct) {
            parameters.add("distinct");
        }
        if (reverse) {
            parameters.add("reverse");
        }
        return parameters;
    }

    public void displayHowTo() {
        System.out.println(
                "|\n" +
                "PARAMETER HOW-TO, please enter:\n" +
                "1. A search key -then 2. An optional part of speech -then\n" +
                "3. An optional 'distinct' -then 4. An optional 'reverse'\n" +
                "|"
        );
    }
}
