import java.util.*;

public class MyDictionary {
    private final Map<String, List<DictionaryEntry>> myDictionary = new HashMap<>();

    private final List<String> exits = new ArrayList<>(Arrays.asList(
            "!q",
            "exit",
            "quit"
    ));

    MyDictionary() {
        loadDictionary();
    }

    public void loadDictionary(){
    }

    public void runInterface(){
        int i = 1;

        System.out.println("! Loading data...");
        loadDictionary();
        System.out.println("! Loading completed...");
        System.out.println();
        System.out.println("===== DICTIONARY 340 JAVA =====");
        System.out.println("----- Keywords: " + myDictionary.size());
        System.out.println("----- Definitions: " + "TO BE IMPLEMENTED");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Search ["+i+"]: ");
            input = scanner.nextLine();
            if (exits.contains(input.toLowerCase())) {
                break;
            }
            System.out.println("|");
            if(input.equalsIgnoreCase("!help") ||  input.equalsIgnoreCase("")){
                System.out.println("Instructions to be implemented");
            }
            System.out.println("|");
            i++;
        }
        System.out.println("\n -----THANK YOU-----");
    }

    //IMPLEMENT GET ARGUMENTS METHOD
    //IMPLEMENT GET TOTAL DEFINITIONS METHOD
}
