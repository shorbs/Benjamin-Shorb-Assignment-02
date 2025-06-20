/****************************************************************
 *
 * File: Main.java
 * By: Benjamin Shorb
 * Date: 6/19/2025
 *
 * Description: Main function that makes new dictionary object
 * then calls the runInterface method to start the program
 *
 ****************************************************************/
public class Main {
    public static void main(String[] args) {
        MyDictionary dictionary = new MyDictionary();
        //dictionary.runInterface();
        dictionary.readFromFile();
    }
}