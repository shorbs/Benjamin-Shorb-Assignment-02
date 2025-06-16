import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyDictionary {
    private final HashMap<String, DictionaryEntry> myDictionary = new HashMap<String, DictionaryEntry>();

    MyDictionary() {
        loadData();
    }

    public void loadData(){
        for(DataSource data : DataSource.values()){
            myDictionary.put(data.getWord(), new DictionaryEntry(data.toEntry()));
        }
    }
}