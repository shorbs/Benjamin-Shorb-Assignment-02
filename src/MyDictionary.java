import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MyDictionary {
    private final Map<String, List<DictionaryEntry>> myDictionary = new HashMap<>();

    private final List<String>{}


    MyDictionary() {
        loadDictionary();
    }

    public void loadDictionary(){
    }

    public void runInterface(){
        int i = 0;

        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
        }
    }
}